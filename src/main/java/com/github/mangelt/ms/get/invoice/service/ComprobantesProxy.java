package com.github.mangelt.ms.get.invoice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.mangelt.sat.services.model.Comprobante;

@FeignClient(name = "ms-all-invoices", url = "localhost:8080")
public interface ComprobantesProxy
{

	@GetMapping("/comprobante")
	List<Comprobante> getAll();

}
