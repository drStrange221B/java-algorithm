package com.company.emrys.algorithm.queue;


import java.lang.reflect.Array;

public class CircularQueue<T> {

    private static final int SPECIAL_EMPTY_VALUE = -1;
    private T[] elements;

    private static int maxSize = 20;
    private Integer headIndex = SPECIAL_EMPTY_VALUE;
    private Integer tailIndex = SPECIAL_EMPTY_VALUE;

    public CircularQueue(Class<T> clazz) {
        this(clazz, maxSize);
    }
    public CircularQueue(Class<T> clazz, int size) {
        elements = (T[]) Array.newInstance(clazz, size);
    }


    public void enqueue(T data) throws QueueOverFlowException{

        if(isFull()){
            throw new QueueOverFlowException("Queue is full !");
        }

        tailIndex = (tailIndex+1)%elements.length;
        System.out.println(elements.getClass().getName());
        elements[tailIndex] = data;

        if(headIndex == SPECIAL_EMPTY_VALUE)
        {
            headIndex = 0;
        }
    }

    public boolean offer(T data) throws QueueOverFlowException{

        if(isFull()){
            return false;
        }

        tailIndex = (tailIndex + 1) % elements.length;
        elements[tailIndex] = data;

        if(headIndex == SPECIAL_EMPTY_VALUE)
        {
            headIndex = 0;
        }

        return true;
    }

    public T dequeue() throws QueueUnderflowException{

        if(isEmpty()){
            throw new QueueUnderflowException("Queue is empty!");
        }

        T data = elements[headIndex];

        if(headIndex == tailIndex){
            headIndex = SPECIAL_EMPTY_VALUE;
        }else
        {
            headIndex =(headIndex + 1) % elements.length;
        }

        return data;
    }

    public T peek() throws QueueUnderflowException{

        if(isEmpty()){
            throw new QueueUnderflowException("Queue is empty !");
        }

        return elements[headIndex];
    }

    public boolean isEmpty() {

        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    public boolean isFull() {
        return (tailIndex + 1)% elements.length == headIndex;
    }

}
