package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@Table(name = "productos")
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Producto {
    @Id
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private float precio;
    @Column(name="stock")
    private int stock;

    @PrePersist
    public void generateId(){
        this.id = UUID.randomUUID();
    }
}
