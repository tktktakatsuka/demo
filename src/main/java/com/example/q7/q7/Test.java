package com.example.q7.q7;

public class Test<T> {
    T val;

    public Test(T val) {
        super();
        this.val = val;
    }
    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}