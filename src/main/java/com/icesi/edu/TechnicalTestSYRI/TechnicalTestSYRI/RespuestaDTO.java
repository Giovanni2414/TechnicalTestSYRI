package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaDTO {
    private UUID facturaId;
    private float precio;
    private String message;
}
