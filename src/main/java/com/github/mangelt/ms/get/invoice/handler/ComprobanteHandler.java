package com.github.mangelt.ms.get.invoice.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class ComprobanteHandler
{

	public Mono<ServerResponse> getById(ServerRequest rq){

		String id = rq.pathVariable("id");

		return null;
	}

}
