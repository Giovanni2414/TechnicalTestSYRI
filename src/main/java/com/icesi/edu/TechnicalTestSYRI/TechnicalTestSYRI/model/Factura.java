package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@Table(name = "facturas")
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Factura {
    @Id
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;
    @Column(name="fecha")
    private String fecha;
    @ManyToOne
    @JoinColumn(name="id_cliente", nullable = false)
    private Cliente cliente;

    @PrePersist
    public void generateId(){
        this.id = UUID.randomUUID();
    }
}
