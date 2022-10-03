package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.controller;

import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.RespuestaDTO;
import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.api.ShopAPI;
import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.UUID;

@RestControllerAdvice
@AllArgsConstructor
public class FacturasController implements ShopAPI {

    private final ShopService shopService;

    @Override
    public RespuestaDTO consultarFactura(UUID facturaId) {
        return shopService.consultarFactura(facturaId);
    }
}
