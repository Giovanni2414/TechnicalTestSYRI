package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.api;

import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.RespuestaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RequestMapping("/facturas")
public interface ShopAPI {
    @GetMapping("/{facturaId}")
    public RespuestaDTO consultarFactura(@PathVariable UUID facturaId);
}
