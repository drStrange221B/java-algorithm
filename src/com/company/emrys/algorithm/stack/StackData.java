package com.company.emrys.algorithm.stack;

public class StackData<T> {

    private final int MAX_SIZE_OF_STACK ;
    private int size;
    private Element<T> top;

    public StackData(int MAX_SIZE_OF_STACK) {
        this.MAX_SIZE_OF_STACK = MAX_SIZE_OF_STACK;
        this.size = 0;

    }

    public void push(T data) throws StackOverflowException{
        if(size==MAX_SIZE_OF_STACK){
            throw new StackOverflowException("The stack is full");
        }

        Element<T> tElement = new Element<T>(data,top);
        top = tElement;
        size ++;

    }

    public T pop() throws StackUnderflowException{

        if(size==0){
            throw new StackUnderflowException("Stack is Empty");
        }

        T data = top.getData();

        top = top.getNext();
        size--;

        return data;
    }

    public T peek()throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException("Stack is Empty");
        }
        return top.getData();
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return MAX_SIZE_OF_STACK==size;
    }

    public int getSize(){
        return size;
    }






}
