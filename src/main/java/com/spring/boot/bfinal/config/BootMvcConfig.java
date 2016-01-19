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

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * mvc configuration by anotation config
 * created on 2015/10/19
 * @author dennisit.pu | dennisit@163.com
 * @version 1.0
 */
@Configuration
public class BootMvcConfig extends WebMvcConfigurerAdapter {

    // UTF8字符集
    private static final Charset UTF8 = Charset.forName("UTF-8");

    // druid监控用户名
    @Value("${druid.username}")
    private String druidUsername;
    // druid监控密码
    @Value("${druid.password}")
    private String druidPassword;


    /**
     * 注册druid监控Servlet
     * @return ServletRegistrationBean
     */
    @Bean
    public ServletRegistrationBean druidStatViewServletBean(){
        ServletRegistrationBean druidStatViewServletBean = new ServletRegistrationBean(new StatViewServlet(), "/druid");
        druidStatViewServletBean.addInitParameter("loginUsername", druidUsername);
        druidStatViewServletBean.addInitParameter("loginPassword", druidPassword);
        return druidStatViewServletBean;
    }

    /**
     * 注册druid监控Filter
     * @return FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean druidWebStatFilterBean(){
        FilterRegistrationBean druidWebStatFilterBean = new FilterRegistrationBean();
        druidWebStatFilterBean.setFilter(new WebStatFilter());
        druidWebStatFilterBean.addUrlPatterns("");
        druidWebStatFilterBean.addInitParameter("exclusions", "/assets,*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid");
        druidWebStatFilterBean.addInitParameter("sessionStatEnable", "false");
        return druidWebStatFilterBean;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // Set HTTP Message converter using a JSON implementation.
        MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
        // Add supported media type returned by BI API.
        List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
        supportedMediaTypes.add(new MediaType("text", "html", UTF8));
        supportedMediaTypes.add(new MediaType("text", "plain", UTF8));
        supportedMediaTypes.add(new MediaType("text", "json", UTF8));
        supportedMediaTypes.add(new MediaType("application", "json", UTF8));
        jsonMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
        converters.add(jsonMessageConverter);
    }

    /**
     * 直接访问jsp的路由
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/test.html").setViewName("html/test");
        registry.addViewController("/404.html").setViewName("html/404");
    }
    /**
     * 试图路径配置
     * @param registry
     */
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // 实例中我们从配置文件加载,故这里不用配置
        //registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
    }

    /**
     * 配置资源文件路由
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
    }

    /**
     * 配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(new TestInterceptor()).excludePathPatterns("/assets/**").addPathPatterns("/**");
    }

    public void setDruidUsername(String druidUsername) {
        this.druidUsername = druidUsername;
    }

    public void setDruidPassword(String druidPassword) {
        this.druidPassword = druidPassword;
    }
}
