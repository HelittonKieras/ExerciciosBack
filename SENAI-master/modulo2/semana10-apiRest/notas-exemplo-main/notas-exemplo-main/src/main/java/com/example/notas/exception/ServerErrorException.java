package com.example.notas.exception;

public class ServerErrorException extends RuntimeException{
    public ServerErrorException(){
        super();
    }

    public ServerErrorException(String message){
        super(message);
    }
}
