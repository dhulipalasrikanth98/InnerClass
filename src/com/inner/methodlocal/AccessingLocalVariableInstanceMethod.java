package com.inner.methodlocal;

public class AccessingLocalVariableInstanceMethod {
    public static void main(String[] args) {

    }
}
class OuterClass{
     int x =50;
        public void m1(){
            int x = 20;

            class Inner{
               // int x =40;
                public void m2(){
                    System.out.println(x);
                    System.out.println(OuterClass.this.x);
                }
            }
            Inner inner = new Inner();
            inner.m2();

    }

    public static void main(String[] args) {
            OuterClass outer = new OuterClass();
            outer.m1();
    }
}
