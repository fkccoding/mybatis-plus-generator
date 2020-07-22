package com.chuckfang.mybatisplusgenerator;

import com.chuckfang.mybatisplusgenerator.util.CodeGenerator;

/**
 * @author https://www.chuckfang.com
 * @date Created on 2020/7/22 12:00
 */
public class Main {
    public static void main(String[] args) {

         // maven 工程 main 包的全路径
        final String mainDir = "/Users/admin/IdeaProjects/mybatis-plus-generator/src/main/";

        CodeGenerator.ConfigBuilder builder = new CodeGenerator.ConfigBuilder();

        CodeGenerator codeGenerator = builder
               // 数据库连接
                .dbUrl("jdbc:mysql://192.168.1.41:3306/data_app?useSSL=false")
               // 账户
                .userName("root")
               // 密码
                .password("Moxi123#")
                // 生成类位置
                .dir(mainDir + "java")
                // 生成xml 位置
                .xmlDir(mainDir + "resources")
                // 包引用路径
                .packageName("com.moxi.outbounddata.app")
                .build();

        // 根据表生成后台代码
        codeGenerator.code("strategy");


    }
}
