package com.unli.cogba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.unli.cogba")
@EntityScan(basePackageClasses = {ApiMain.class, Jsr310JpaConverters.class})
public class ApiMain {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApiMain.class, args);
	}
}
