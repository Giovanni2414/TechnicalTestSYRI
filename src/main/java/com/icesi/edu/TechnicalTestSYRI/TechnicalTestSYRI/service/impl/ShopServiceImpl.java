package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.service.impl;

import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.RespuestaDTO;
import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model.Detalle;
import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model.Factura;
import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.repository.DetalleRepository;
import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.repository.FacturaRepository;
import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ShopServiceImpl implements ShopService {

    private final FacturaRepository facturaRepository;
    private final DetalleRepository detalleRepository;

    @Override
    public RespuestaDTO consultarFactura(UUID facturaId) {
        Factura response = facturaRepository.findById(facturaId).orElse(null);
        RespuestaDTO respuestaDTO = new RespuestaDTO();
        if (response != null) {
            respuestaDTO.setFacturaId(response.getId());
            List<Detalle> detalles = detalleRepository.findByFacturaId(response.getId());
            float preciototal = 0;
            for(int c = 0; c < detalles.size(); c++) {
                preciototal += detalles.get(c).getPrecio();
            }
            if(detalles.size() >= 5 && preciototal >= 1000000) {
                respuestaDTO.setMessage("Cantidad de productos mayor a 5 y precio mayor a 1M, se otorga valor del 10%");
                respuestaDTO.setPrecio(preciototal);
            } else {
                respuestaDTO.setPrecio(preciototal);
                respuestaDTO.setMessage("La cantidad de productos no es mayor a 5 ni el precio total supera el millón de pesos");
            }
        } else {
            respuestaDTO.setMessage("La factura con id " + facturaId.toString() + " no existe");
        }
        return respuestaDTO;
    }
}
