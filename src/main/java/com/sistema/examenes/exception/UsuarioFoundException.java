package com.sistema.examenes.exception;

public class UsuarioFoundException extends Exception {

    public UsuarioFoundException() {
        super("El usuario con ese nombre de usuario ya existe en la base de datos, vuelva a intentarlo!!");
    }

    public UsuarioFoundException(String mensaje) {
        super(mensaje);
    }

}
