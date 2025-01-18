package com.flcode.inventario_sistem.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nombre_usuario;
    String contrasena;
    String nombre;
    String apellido;
    String email;
    Rol rol;


    public enum Rol {
        ADMIN, EMPLEADO
    }
}
