package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.service;

import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.RespuestaDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

public interface ShopService {
    public RespuestaDTO consultarFactura(@PathVariable UUID facturaId);
}
