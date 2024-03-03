package com.example;

import org.junit.Test;

import com.example.q2.q2.A;
import com.example.q2.q2.Factory;

public class TestTest {

    @Test
    public void execute() {
        System.out.println("お決まりの事前処理");
        A a = Factory.create();
        a.hello();
        System.out.println("お決まりの事後処理");
    }

}
