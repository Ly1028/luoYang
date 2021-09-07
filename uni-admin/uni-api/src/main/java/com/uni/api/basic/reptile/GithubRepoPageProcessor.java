package com.uni.api.basic.reptile;


import com.uni.common.utils.JsonUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.HashMap;
import java.util.Set;

public class GithubRepoPageProcessor implements PageProcessor {

    private final Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setCharset("utf-8");

    {
        String json = "{\"\":\"scheme: https\",\"accept\":\"*/*\",\"accept-encoding\":\"gzip, deflate, br\",\"accept-language\":\"zh-CN,zh;q=0.9,en;q=0.8\",\"content-type\":\"application/x-www-form-urlencoded\",\"origin\":\"https://www.nike.com\",\"referer\":\"https://www.nike.com/\",\"sec-ch-ua\":\"\\\"Google Chrome\\\";v=\\\"93\\\", \\\" Not;A Brand\\\";v=\\\"99\\\", \\\"Chromium\\\";v=\\\"93\\\"\",\"sec-ch-ua-mobile\":\"?0\",\"sec-ch-ua-platform\":\"\\\"Windows\\\"\",\"sec-fetch-dest\":\"empty\",\"sec-fetch-mode\":\"cors\",\"sec-fetch-site\":\"cross-site\",\"user-agent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4557.4 Safari/537.36\"}";
        HashMap hashMap = JsonUtils.jsonToPojo(json, HashMap.class);
        Set<String> strings = hashMap.keySet();
        for (String str : strings) {
            site.addHeader(str, hashMap.get(str) + "");
        }
    }


    @Override
    public void process(Page page) {
        page.putField("readme", page.getHtml().xpath("//div[@class='pre-modal-window']"));
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor()).addUrl("https://www.nike.com/cn/").addPipeline(new JsonFilePipeline("D:\\webmagic\\")).thread(5).run();
    }
}
