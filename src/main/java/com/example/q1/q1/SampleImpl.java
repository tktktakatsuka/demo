package com.example.q1.q1;

/**
 * このクラスはtestとexecuteメソッドを持っている
 * executeは公開したい、testは隠ぺいしたい。
 * classのアクセス修飾子をデフォルトにすることで、
 * パッケージ外からのクラスからアクセスできなくしている。
 * 利用する側の型はinterfaceで定義するため、Sampleinterfaceで定義したmethodしか呼び出すことはできない。
 */
class SampleImpl implements Sample {

    public void test() {
        System.out.println("test");
    }

    @Override
    public void execute() {
        System.out.println("execute");
    }
}