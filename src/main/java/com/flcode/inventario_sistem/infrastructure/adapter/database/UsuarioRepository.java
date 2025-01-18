package com.flcode.inventario_sistem.infrastructure.adapter.database;

import com.flcode.inventario_sistem.domain.model.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuarios,Integer> {

}
