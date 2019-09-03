package com.github.mangelt.ms.get.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.reactive.config.EnableWebFlux;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients("com.github.mangelt.ms.get.invoice.service")
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
}
