package com.icesi.edu.TechnicalTestSYRI.TechnicalTestSYRI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.util.Set;
import java.util.UUID;

@Data
@Table(name = "clientes")
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Cliente {
    @Id
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="direccion")
    private String direccion;
    @Column(name="fecha_nacimiento")
    private String fecha_nacimiento;
    @Column(name="telefono")
    private String telefono;
    @Column(name="email")
    private String email;
    @Column(name="categoria")
    private String categoria;

    @PrePersist
    public void generateId(){
        this.id = UUID.randomUUID();
    }
}
