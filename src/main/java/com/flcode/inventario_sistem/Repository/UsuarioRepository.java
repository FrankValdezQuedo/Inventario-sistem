package com.flcode.inventario_sistem.Repository;

import com.flcode.inventario_sistem.Entities.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuarios,Integer> {

}
