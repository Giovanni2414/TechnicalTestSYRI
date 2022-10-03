package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Table(name = "detalles")
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Detalle {
    @Id
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;
    @ManyToOne
    @JoinColumn(name="id_factura", nullable = false)
    private Factura factura;

    @ManyToOne
    @JoinColumn(name="id_producto", nullable = false)
    private Producto producto;

    @Column(name="cantidad")
    private int cantidad;
    @Column(name="precio")
    private float precio;

    @PrePersist
    public void generateId(){
        this.id = UUID.randomUUID();
    }
}
