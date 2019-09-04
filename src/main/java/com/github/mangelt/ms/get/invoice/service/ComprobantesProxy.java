package com.github.mangelt.ms.get.invoice.service;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.mangelt.ms.get.invoice.config.RibbonConfig;
import com.github.mangelt.sat.services.model.Comprobante;

@FeignClient(name = "ms-all-invoices")
@RibbonClient(name="ms-all-invoices", configuration = RibbonConfig.class)
public interface ComprobantesProxy
{

	@LoadBalanced
	@GetMapping("/comprobante")
	List<Comprobante> getAll();

}
