package com.company;

public class GenericObject<T1, T2> {
    T1 id;
    T2 name;

    public GenericObject(T1 id, T2 name) {
        this.id = id;
        this.name = name;
    }

    public T1 getSomething() {
        return id;
    }

}
