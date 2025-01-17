package com.flcode.inventario_sistem.Services;

import com.flcode.inventario_sistem.Entities.Usuarios;
import com.flcode.inventario_sistem.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public Usuarios getUsuario(Integer id) {
        return usuarioRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Usuarios> getUsuarios() {
        return StreamSupport.stream(usuarioRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public void addUsuario(Usuarios usuarios) {
     usuarioRepository.save(usuarios);
    }

    @Override
    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }

}
