package com.sistema.examenes.services;

import com.sistema.examenes.entities.Usuario;
import com.sistema.examenes.entities.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

}
