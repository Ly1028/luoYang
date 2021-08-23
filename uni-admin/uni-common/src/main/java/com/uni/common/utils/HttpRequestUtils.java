package com.uni.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author luoYang
 * @date 16:36 2021/8/23
 * http请求工具类
 */
public class HttpRequestUtils {
    private static final Logger LOG = LoggerFactory.getLogger(HttpRequestUtils.class);

    /**
     * httpPost 多一个域名请求参数
     *
     * @param url
     * @param jsonParam
     * @param contentType
     * @param host
     * @return
     */
    public static JSONObject httpPostReturnJsonObj(String url, JSONObject jsonParam,
                                                   ContentType contentType, String host) {
        LOG.info("请求url: " + url + " 入参参数:" + jsonParam + " 格式:" + contentType);
        String resultStr = httpPost(url, jsonParam, contentType, false, host);
        LOG.info("http请求返回内容为: " + resultStr);
        return JSONObject.parseObject(resultStr);
    }

    /**
     * @param url
     * @param jsonParam
     * @param contentType
     * @param noNeedResponse
     * @param host
     * @return
     */
    public static String httpPost(String url, JSONObject jsonParam, ContentType contentType, boolean noNeedResponse,
                                  String host) {
        // post请求返回结果
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String str = "";
        org.apache.http.client.methods.HttpPost method = new HttpPost(url);

        if (contentType == null) {
            contentType = ContentType.APPLICATION_JSON;
        }
        method.setHeader("Content-Type", contentType.getMimeType());
        try {
            if (null != jsonParam) {
                // 设置参数到请求对象中
                if (contentType == ContentType.APPLICATION_JSON || contentType == ContentType.TEXT_PLAIN) {
                    method.setEntity(new StringEntity(jsonParam.toString(), contentType));
                } else {
                    // 装填参数
                    List<NameValuePair> nameValuePair = new ArrayList<>();
                    Iterator<String> paramIter = jsonParam.keySet().iterator();
                    while (paramIter.hasNext()) {
                        String key = paramIter.next().toString();
                        String value = String.valueOf(jsonParam.get(key));
                        nameValuePair.add(new BasicNameValuePair(key, value));
                    }
                    method.setEntity(new UrlEncodedFormEntity(nameValuePair, StandardCharsets.UTF_8));
                }
            }
            HttpResponse response = httpclient.execute(method);
            url = URLDecoder.decode(url, StandardCharsets.UTF_8.name());
            // 请求发送成功，并得到响应
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                // 读取服务器返回过来的json字符串数据
                str = EntityUtils.toString(response.getEntity());
            } else {
                LOG.info("post请求提交失败:" + url + "; 错误码: " + response.getStatusLine().getStatusCode() + "; 错误信息: "
                        + response.getStatusLine().getReasonPhrase());
            }
            // 关闭流
            EntityUtils.consume(response.getEntity());
            httpclient.close();
        } catch (IOException e) {
            LOG.error("post请求提交失败:" + url, e);
        }

        return str;
    }

    /**
     * 功能：检测当前URL是否可连接或是否有效, 描述：最多连接网络 5 次, 如果 5 次都不成功，视为该地址不可用
     *
     * @param urlStr 指定URL网络地址
     * @return URL
     */
    public static boolean isConnect(String urlStr, String requestMethod) {
        int counts = 0;
        if (urlStr == null || urlStr.length() <= 0) {
            return false;
        }
        SimpleConnection simpleConnection;
        boolean isConnected = false;
        while (counts < 5) {
            // 最多重试5次
            counts++;
            try {
                simpleConnection = getConnection(new URI(urlStr), requestMethod);
                if (simpleConnection != null && simpleConnection.connection != null) {
                    LOG.debug("URL \t\n {} \t\n 连接成功", urlStr);
                    isConnected = true;
                    break;
                }
            } catch (Exception ex) {
                LOG.debug("URL\t\n {}\t\n 不可用，连接第{}次", urlStr, counts);
                continue;
            }
        }
        return isConnected;
    }

    private static class SimpleConnection {

        public HttpURLConnection connection = null;
        public int responseCode = HttpURLConnection.HTTP_OK;
    }

    private static SimpleConnection getConnection(URI uri, String requestMethod) throws IOException {
        // Check ability to connect.
        SimpleConnection simpleConnection = new SimpleConnection();
        HttpURLConnection connection = (HttpURLConnection) uri.toURL().openConnection();
        if (StringUtils.isNotBlank(requestMethod)) {
            connection.setRequestMethod(requestMethod);
        } else {
            connection.setRequestMethod("GET");
        }
        // Store response code so we can get more information about
        // returning connection.
        simpleConnection.responseCode = connection.getResponseCode();
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            simpleConnection.connection = connection;
        } else {
            closeConnection(connection);
            simpleConnection.connection = null;
        }
        return simpleConnection;
    }

    static void closeConnection(URLConnection connection) {
        if (connection instanceof HttpURLConnection) {
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            try {
                if (httpConnection.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST
                        && httpConnection.getInputStream() != null) {
                    httpConnection.getInputStream().close();
                }
            } catch (IOException ex) {
                try {
                    if (httpConnection.getErrorStream() != null) {
                        httpConnection.getErrorStream().close();
                    }
                } catch (IOException e) {
                }
            }
        }
    }
}
