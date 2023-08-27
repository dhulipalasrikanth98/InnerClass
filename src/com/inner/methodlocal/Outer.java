package com.inner.methodlocal;

public class Outer {

    public void m1(){

        class Inner{
            public void sum(int x,int y){
                System.out.println(x+y);
            }
        }
        Inner i = new Inner();
        i.sum(2,3);
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
    }
}
