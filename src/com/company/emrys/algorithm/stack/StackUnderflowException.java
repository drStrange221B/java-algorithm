package com.company.emrys.algorithm.stack;

public class StackUnderflowException extends Exception {

    public StackUnderflowException(String message, Throwable e){
        super(message,e);
    }
    public StackUnderflowException(String message){
        super(message);
    }

}
