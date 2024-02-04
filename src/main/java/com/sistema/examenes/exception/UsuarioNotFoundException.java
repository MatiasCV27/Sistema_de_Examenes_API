package com.sistema.examenes.exception;

public class UsuarioNotFoundException extends Exception {

    public UsuarioNotFoundException() {
        super("El usuario con ese nombre de usuario no existe en la base de datos, vuelva a intentarlo!!");
    }

    public UsuarioNotFoundException(String mensaje) {
        super(mensaje);
    }

}
