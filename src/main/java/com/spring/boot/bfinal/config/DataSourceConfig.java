/*--------------------------------------------------------------------------
 *  Copyright (c) 2009-2020, dennisit.pu All rights reserved. 
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the yinyuetai developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: dennisit.pu (dennisit@163.com)
 *--------------------------------------------------------------------------
*/
package com.spring.boot.bfinal.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * 连接池配置：https://github.com/alibaba/druid/wiki/DruidDataSource%E9%85%8D%E7%BD%AE%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8
 * created on 2015/10/19
 * @author dennisit.pu | dennisit@163.com
 * @version 1.0
 */
@Configuration
@MapperScan(basePackages="com.spring.boot.bfinal.repository")
public class DataSourceConfig {


    // Druid连接池
    private DruidDataSource pool;


    @Bean(destroyMethod="close")
    //扫描property/jdbc.properties中的配置属性,根据前缀为"datasource.druid"获取
    //@ConfigurationProperties(prefix="datasource.druid",locations="property/jdbc.properties")
    @ConfigurationProperties(prefix="datasource.druid")
    public DataSource dataSource() {
        pool = new DruidDataSource();
        return pool;
    }

    @PreDestroy
    public void close() {
        if (this.pool != null) {
            this.pool.close();
        }
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        // mybatis别名扫描
        sqlSessionFactoryBean.setTypeAliasesPackage("com.spring.boot.bfinal.domain");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        // 注入mybatis mapper xml文件
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/sqlmap/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
