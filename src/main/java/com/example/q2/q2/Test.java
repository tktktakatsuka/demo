package com.example.q2.q2;

import java.util.function.Supplier;

public class Test {
    public void execute(Supplier<A> supplier) {
        System.out.println("お決まりの前処理");
        A a = supplier.get();
        a.hello();
        System.out.println("お決まりの後処理");
    }

}
