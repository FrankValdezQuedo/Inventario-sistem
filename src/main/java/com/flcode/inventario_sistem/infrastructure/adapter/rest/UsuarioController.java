package com.flcode.inventario_sistem.infrastructure.adapter.rest;

import com.flcode.inventario_sistem.domain.model.Usuarios;
import com.flcode.inventario_sistem.domain.port.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // Define un prefijo común para todas las rutas
public class UsuarioController {

    private final UsuarioService usuarioService;

    // Inyección de dependencias a través del constructor
    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Endpoint para obtener un usuario por ID
    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuarios> getUsuario(@PathVariable Integer id) {
        Usuarios usuario = usuarioService.getUsuario(id);
        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(null); // Retorna 404 si no se encuentra el usuario
        }
        return ResponseEntity.ok(usuario); // Retorna 200 con el usuario encontrado
    }

    // Endpoint para obtener todos los usuarios
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuarios>> getUsuarios() {
        List<Usuarios> usuarios = usuarioService.getUsuarios();
        return ResponseEntity.ok(usuarios); // Retorna 200 con la lista de usuarios
    }

   @PostMapping("/usuario")
    public void addUsuario(@RequestBody Usuarios usuarios){
        usuarioService.addUsuario(usuarios);
   }

   @DeleteMapping("/usuario/{id}")
   public void deleteUsuario(@PathVariable Integer id){
        usuarioService.deleteUsuario(id);
   }
}
