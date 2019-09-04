package com.github.mangelt.ms.get.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;

import feign.Request;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableWebFlux
@Slf4j
public class App
{
	public static void main( String[] args )
	{
		log.info("Starting ms-get-invoice spring boot application.");
		SpringApplication.run(App.class, args);
	}

	@Bean
	public Request.Options timeoutConfiguration(){
		return new Request.Options(5000, 30000);
	}

}
