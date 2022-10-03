package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.repository;

import com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientsRepository extends JpaRepository<Cliente, UUID> {
}
