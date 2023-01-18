package com.vaysai.arxiv.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.vaysai.arxiv.client.ArxivClient;
import com.vaysai.arxiv.proxy.OpenArxivClientProxy;
import com.vaysai.arxiv.client.FeignClientInterceptor;

@EnableFeignClients(clients = ArxivClient.class)
@ComponentScan(basePackageClasses = {OpenArxivClientProxy.class, FeignClientInterceptor.class})
@Configuration
@PropertySource(value = "classpath:openAIJava-application.yaml", factory = YamlPropertySourceFactory.class)
public class OpenArxivConfiguration {
}