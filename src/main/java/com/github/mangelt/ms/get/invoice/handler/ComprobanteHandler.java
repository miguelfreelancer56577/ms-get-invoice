package com.github.mangelt.ms.get.invoice.handler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.github.mangelt.ms.get.invoice.service.ComprobantesProxy;
import com.github.mangelt.sat.services.model.Comprobante;

import reactor.core.publisher.Mono;

@Component
public class ComprobanteHandler
{

	@Autowired
	ComprobantesProxy comProxy;

	public Mono<ServerResponse> getById(ServerRequest rq){

		Optional<Comprobante> comp = this.comProxy.getAll().stream().filter(comprobante->comprobante.getId().equalsIgnoreCase(rq.pathVariable("id"))).findFirst();

		if(comp.isPresent())
		{
			return ServerResponse
					.ok()
					.body(Mono.just(comp.get()), Comprobante.class);
		}
		else
		{
			return ServerResponse.notFound().build();
		}

	}

}
