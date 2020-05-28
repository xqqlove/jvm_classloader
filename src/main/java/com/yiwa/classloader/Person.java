package com.yiwa.classloader;

public class Person {
    private String name;
    private String age;

    static {
        System.out.println("静态初始化");
    }

    public Person() {
        System.out.println("无参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
