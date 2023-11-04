package org.example;

public class Manager <T> implements GenericInterface<T>{
    @Override
    public boolean add(T data) {
        return true;
    }

    @Override
    public boolean update(T data) {
        return true;
    }

    @Override
    public boolean delete(T data) {
        return true;
    }

    @Override
    public void getAll(T data) {
        System.out.println("Data: "+ data);
    }
}
