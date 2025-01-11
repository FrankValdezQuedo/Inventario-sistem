package com.flcode.inventario_sistem.Controller;

import com.flcode.inventario_sistem.Entities.Usuarios;
import com.flcode.inventario_sistem.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/api/usuario/{id}")
    public Usuarios Usuarios(@PathVariable Integer id) {
      return  usuarioService.getUsuario(id);

    }

}
