package com.murasakiExample.q2.q1;

@FunctionalInterface
public interface Test<T> {
    default void equals() {
        System.out.println("hogehoge");
    };
    void Task(T t);
}
