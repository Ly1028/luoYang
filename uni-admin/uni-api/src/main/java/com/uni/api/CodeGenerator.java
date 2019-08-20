//package com.uni.api;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import java.util.*;
//
//
///**
// * 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
// *
// * @program: uniApi
// * @description:
// * @author: LuoYang
// * @create: 2019-07-19 10:08
// */
//
//public class CodeGenerator {
//    private static String url = "jdbc:mysql://localhost:3306/spro_h_crm_test_localhost?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
//    private static String username = "root";
//    private static String password = "ly123--//";
//    private static String driverName = "com.mysql.cj.jdbc.Driver";
//
//
//
//
//    /**
//     * <p>
//     * MySQL 生成演示
//     * </p>
//     */
//    public static void main(String[] args) {
//        AutoGenerator mpg = new AutoGenerator();
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        gc.setFileOverride(true);
//        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
//        gc.setEnableCache(false);// XML 二级缓存
//        gc.setBaseResultMap(true);// XML ResultMap
//        gc.setBaseColumnList(false);// XML columList
//        // .setKotlin(true) 是否生成 kotlin 代码
//        gc.setAuthor("LuoYang");
//        // 生成文件的输出目录
////        gc.setOutputDir("D:\\javaDemo\\uni-admin\\uni-api\\src\\main\\java");
//        // 自定义文件命名，注意 %s 会自动填充表实体属性！
//        gc.setMapperName("%sDao");
//        gc.setXmlName("%sMapper");
//        gc.setServiceName("%sService");
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setControllerName("%sController");
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setTypeConvert(new MySqlTypeConvert() {
////            // 自定义数据库表字段类型转换【可选】
////            @Override
////            public DbColumnType processTypeConvert(String fieldType) {
////                System.out.println("转换类型：" + fieldType);
////                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
////                return super.processTypeConvert(fieldType);
////            }
//        });
//        dsc.setDriverName(driverName);
//        dsc.setUsername(username);
//        dsc.setPassword(password);
//        dsc.setUrl(url);
//        mpg.setDataSource(dsc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
//        strategy.setTablePrefix(new String[]{});// 此处可以修改为您的表前缀
//        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
//        strategy.setInclude(new String[]{"act_hi_taskinst"}); // 需要生成的表
//        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
//        // 自定义实体父类
//        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
//        // 自定义实体，公共字段
//        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
//        // 自定义 dao 父类
//        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
//        // 自定义 service 父类
//        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
//        // 自定义 service 实现类父类
//        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
//        // 自定义 controller 父类
//        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
//        // 【实体】是否生成字段常量（默认 false）
//        // public static final String ID = "test_id";
//        // strategy.setEntityColumnConstant(true);
//        // 【实体】是否为构建者模型（默认 false）
//        // public User setName(String name) {this.name = name; return this;}
//        // strategy.setEntityBuilderModel(true);
//        mpg.setStrategy(strategy);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.uni.api.basic");
//        pc.setService("");
//        pc.setServiceImpl("");
//        pc.setEntity("");
//        pc.setMapper("");
//        mpg.setPackageInfo(pc);
//
//
//        // 自定义 controller 生成
//        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
//        focList.add(new FileOutConfig("/templates/controller.java.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输入文件名称
//                return "D:\\javaDemo\\uni-admin\\uni-api\\src\\main\\java\\com\\uni\\api\\basic\\" + tableInfo.getEntityName().toLowerCase() + "\\" + "controller" + "\\" + tableInfo.getEntityName() + "Controller.java";
//            }
//        });
//
//        // 自定义 service 生成
//        focList.add(new FileOutConfig("/templates/service.java.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输入文件名称
//                return "D:\\javaDemo\\uni-admin\\uni-api\\src\\main\\java\\com\\uni\\api\\basic\\" + tableInfo.getEntityName().toLowerCase() + "\\" + "service" + "\\" + tableInfo.getEntityName() + "Service.java";
//            }
//        });
//
//
//        // 自定义 serviceImpl 生成
//        focList.add(new FileOutConfig("/templates/serviceImpl.java.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输入文件名称
//                return "D:\\javaDemo\\uni-admin\\uni-api\\src\\main\\java\\com\\uni\\api\\basic\\" + tableInfo.getEntityName().toLowerCase() + "\\" + "service\\Impl" + "\\" + tableInfo.getEntityName() + "ServiceImpl.java";
//            }
//        });
//
//        // 自定义 entity 生成
//        focList.add(new FileOutConfig("/templates/entity.java.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输入文件名称
//                return "D:\\javaDemo\\uni-admin\\uni-api\\src\\main\\java\\com\\uni\\api\\basic\\" + tableInfo.getEntityName().toLowerCase() + "\\" + "entity" + "\\" + tableInfo.getEntityName() + "Entity.java";
//            }
//        });
//
//        // 自定义 dao 生成
//        focList.add(new FileOutConfig("/templates/mapper.java.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输入文件名称
//                return "D:\\javaDemo\\uni-admin\\uni-api\\src\\main\\java\\com\\uni\\api\\basic\\" + tableInfo.getEntityName().toLowerCase() + "\\" + "dao" + "\\" + tableInfo.getEntityName() + "Dao.java";
//            }
//        });
//
//        // 调整 xml 生成目录演示
//        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return "D:\\javaDemo\\uni-admin\\uni-api\\src\\main\\resources\\dao\\" + tableInfo.getEntityName().toLowerCase() + "\\" + tableInfo.getEntityName() + ".xml";
//            }
//        });
//        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
//        InjectionConfig cfg = new InjectionConfig() {
//            @Override
//            public void initMap() {
//                Map<String, Object> map = new HashMap<String, Object>();
//                map.put("author", "LuoYang");
//            }
//        };
//
//
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);
//
//        // 关闭默认 xml 生成，调整生成 至 根目录
//        TemplateConfig tc = new TemplateConfig();
//        tc.setXml(null);
//        mpg.setTemplate(tc);
//
//        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
//        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
////        tc.setController("templates/controller.java");
////        tc.setEntity("templates/entity.java");
////        tc.setMapper("templates/dao.java");
////        tc.setService("templates/service.java");
////        tc.setServiceImpl("templates/serviceImpl.java");
////         如上任何一个模块如果设置 空 OR Null 将不生成该模块。
////        mpg.setTemplate(tc);
//
//        // 执行生成
//        mpg.execute();
//
//    }
//
//}
