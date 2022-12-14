package com.vaysai.arxiv.annotation;


import org.springframework.context.annotation.Import;

import com.vaysai.arxiv.configuration.OpenArxivConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(OpenArxivConfiguration.class)
public @interface EnableArxivClient {
}
