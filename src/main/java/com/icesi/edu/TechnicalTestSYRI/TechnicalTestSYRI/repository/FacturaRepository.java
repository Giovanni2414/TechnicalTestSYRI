package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.repository;

import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FacturaRepository extends JpaRepository<Factura, UUID> {
}
