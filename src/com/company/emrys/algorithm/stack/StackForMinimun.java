package com.company.emrys.algorithm.stack;

public class StackForMinimun<T extends Comparable> {
    private StackData<T> stackValue ;
    private StackData<T> minStack ;

    public StackForMinimun(int size){
        this.stackValue = new StackData<>(size);
        this.minStack = new StackData<>(size);
    }

    public void push(T data) throws StackOverflowException,StackUnderflowException{

        T min = data;

        if(!stackValue.isEmpty()){

            if(min.compareTo(minStack.peek())>0){
                min = minStack.peek();
            }
        }

        stackValue.push(data);
        minStack.push(min);
    }

    public T pop() throws StackUnderflowException{
        minStack.pop();

        return stackValue.pop();
    }

    public T getMin() throws StackUnderflowException{
        return minStack.peek();
    }

}
