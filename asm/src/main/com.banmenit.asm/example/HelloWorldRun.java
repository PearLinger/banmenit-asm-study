package com.banmenit.asm.example;

/**
 * @author yangyi
 * @version v 1.0
 * @date 2023/11/18 20:16
 */
public class HelloWorldRun {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> aClass = classLoader.loadClass("sample.HelloWorld");
        Object o = aClass.newInstance();
        System.out.println(o);
    }
}
