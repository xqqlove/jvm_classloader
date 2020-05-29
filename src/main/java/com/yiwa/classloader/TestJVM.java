package com.yiwa.classloader;

import java.util.ArrayList;
import java.util.List;

class Demo{

        }
public class TestJVM {
    public static void main(String[] args) {
        List<Demo> list=new ArrayList<Demo>();
        int i=1;
        while(true){
            list.add(new Demo());
            System.out.println(i++);

        }
    }
}
