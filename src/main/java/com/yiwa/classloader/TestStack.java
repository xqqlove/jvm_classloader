package com.yiwa.classloader;

public class TestStack {
    public static void main(String[] args) {
        int i=1;
        test(i);
    }
    public static void test(int i){
        System.out.println("start*******"+i);
        test(i+1);
    }
}
