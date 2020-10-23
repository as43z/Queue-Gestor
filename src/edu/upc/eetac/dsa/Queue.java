package edu.upc.eetac.dsa;

public interface Queue<T>{
    public void push(T t) throws FullQueueException;
    public T pop() throws EmptyQueueException;
    public int size();
}