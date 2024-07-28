package com.example.q13.q10;

public class Test implements AutoCloseable{
    @Override
    public void close() throws Exception{
        throw new Exception("A");
    }
}
