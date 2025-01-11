package com.flcode.inventario_sistem.Services;

import com.flcode.inventario_sistem.Entities.Usuarios;
import com.flcode.inventario_sistem.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class  UsuarioServiceImpl implements UsuarioService {

    @Autowired
     UsuarioRepository usuarioRepository;


    @Override
    public Usuarios getUsuario(Integer id) {

        Optional<Usuarios>  usuarios = usuarioRepository.findById(id);
        if (usuarios.isPresent()){
            return usuarios.get();
        }
        return null;
    }
}
