package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.repository;

import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DetalleRepository extends JpaRepository<Detalle, UUID> {
    List<Detalle> findByFacturaId(UUID facturaId);
}
