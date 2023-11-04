package org.example;

public class GenericMethod {
    public <T> void print(T[] array){
        for (T obj : array){
            System.out.println(obj);
        }
    }
}
