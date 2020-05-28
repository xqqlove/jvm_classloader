package com.yiwa.classloader;

import javax.annotation.Resource;

public class TestClassLoader {

    public static void main(String[] args)throws ClassNotFoundException {
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
//        loader.loadClass("com.yiwa.classloader.Person");
        Class.forName("com.yiwa.classloader.Person",false,loader);
    }
}
