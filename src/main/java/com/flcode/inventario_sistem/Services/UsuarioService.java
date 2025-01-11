package com.flcode.inventario_sistem.Services;

import com.flcode.inventario_sistem.Entities.Usuarios;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
    public Usuarios getUsuario(Integer id);
}
