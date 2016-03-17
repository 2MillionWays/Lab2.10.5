package com.brainacad.oop.testwrapper2;


public class Main {
    public static void main(String[] args) {

        System.out.println(compute((short) 10, 15));

        assert compute((short) 2,10)==15;

    }
    static long compute(Short s, Integer i){
        Long l = new Long ((long)s+i);
        return l;
    }
}
