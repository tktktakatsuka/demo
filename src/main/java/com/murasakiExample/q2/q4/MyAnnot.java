package com.murasakiExample.q2.q4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@interface MyAnnot {
    String hoge();
}

/**
 * InnerMyAnnot
 */
class Foo {
    @MyAnnot(hoge = "hoge")
    int num;

    public void method(@MyAnnot(hoge = "hogehoge") int a) {
        try {
            // メソッドの取得
            Method method = Foo.class.getMethod("method", int.class);

            // パラメータの取得
            Parameter[] parameters = method.getParameters();

            for (Parameter parameter : parameters) {
                // アノテーションの取得
                if (parameter.isAnnotationPresent(MyAnnot.class)) {
                    MyAnnot annot = parameter.getAnnotation(MyAnnot.class);
                    // アノテーションの値を使用
                    System.out.println("Annotation value: " + annot.hoge());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

}