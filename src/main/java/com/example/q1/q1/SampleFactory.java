package com.example.q1.q1;

/**
 * このクラスはtestとexecuteメソッドを持っている
 * executeは公開したい、testは隠ぺいしたい。
 */
public class SampleFactory {
    public static Sample create() {
        return new SampleFactory().new SampleImpl();
    }

    public class SampleImpl implements Sample {
        public void test() {
            System.out.println("test");
        }

        @Override
        public void execute() {
            System.out.println("execute");
        }
    }

    // private class SampleImpl implements Sample{
    // public void test(){
    // System.out.println("test");
    // }

    // @Override
    // public void execute(){
    // System.out.println("execute");
    // }
    // }

}