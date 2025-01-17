package com.flcode.inventario_sistem.Services;

import com.flcode.inventario_sistem.Entities.Usuarios;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    public Usuarios getUsuario(Integer id);
    public List<Usuarios> getUsuarios();
    public void addUsuario(Usuarios usuarios);
    public void deleteUsuario(Integer id);

}
