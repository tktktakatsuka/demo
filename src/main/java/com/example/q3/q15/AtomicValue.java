package com.example.q3.q15;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicValue extends Value {
    private AtomicInteger num = new AtomicInteger();

    public void add(int num){
        this.num.addAndGet(num);
    }

    public int get(){
        return this.num.intValue();
    }

}
