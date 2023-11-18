package com.banmenit.asm.example;

/**
 * @author yangyi
 * @version v 1.0
 * @date 2023/11/18 20:13
 */
public class MyClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        if("sample.HelloWorld".equals(className)){
            byte[] classBytes = null;
            try {
                classBytes = HelloWorldDump.dump();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return defineClass(className,classBytes,0,classBytes.length);
        }
        throw new ClassNotFoundException("Class Not Found:"+className);
    }

}
