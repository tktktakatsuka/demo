package com.example.q1.q6;

public class Sample {
    private String message;

    public Test test(String value){

        value = "localmessage";
        String hoge  = "hello";
        hoge = "hoge";
        message = "hoge";

        // ローカルクラス
        class A implements Test{
            @Override
            public void execute(){
                // System.out.println(message + value + hoge);
                
            }
        }
        return new A();
    }
}
