package com.company.emrys.algorithm.stack;

import java.util.concurrent.ExecutorService;

public class StackOverflowException extends Exception {

    public StackOverflowException(String message, Throwable e){
        super(message, e);
    }

    public StackOverflowException(String message){
        super(message);
    }
}
