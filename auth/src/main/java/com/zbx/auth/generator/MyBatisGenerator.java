package com.zbx.auth.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;

/**
 * @时间 2022/3/25
 * @作者 zbx
 * @描述
 **/
public class MyBatisGenerator {

    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://42.193.218.79:13658/hctools?serverTimezone=Asia/Shanghai&useUnicode=true&zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=utf-8", "ENC(7jn6lUeSJSrUJ35F1/FB+Q==)", "ENC(th8n8WbsZmoTo5Y3TicwfG37ryEenAyv)");

    public static void main(String[] args) {
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                .globalConfig(builder -> {
                    builder.author("zbx") // 设置作者
                            .outputDir("C:\\Users\\Administrator\\IdeaProjects\\hctools\\auth\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.zbx.auth") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\Users\\Administrator\\IdeaProjects\\hctools\\auth\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder()
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .logicDeleteColumnName("deleted")
                            .addTableFills(new Column("create_time", FieldFill.INSERT))
                            .addTableFills(new Column("create_by", FieldFill.INSERT))
                            .addTableFills(new Column("update_time", FieldFill.UPDATE))
                            .addTableFills(new Column("update_by", FieldFill.UPDATE))
                            .controllerBuilder()
                            .enableRestStyle()
                            .mapperBuilder()
                            .enableMapperAnnotation();
                    builder.addInclude("role","permission"); // 设置需要生成的表名
                })
                .execute();
    }
}
