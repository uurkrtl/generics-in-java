package org.example;

public interface GenericInterface<T> {
    public boolean add(T data);
    public boolean update(T data);
    public boolean delete(T data);
    public void getAll(T data);
}
