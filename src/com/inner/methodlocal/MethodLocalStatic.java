package com.inner.methodlocal;

public class MethodLocalStatic {
    public static void main(String[] args) {
        OuterStaticMethod outerStaticMethod = new OuterStaticMethod();
        OuterStaticMethod.m1();
    }
}
class OuterStaticMethod{

    int k = 30;
    static int l = 20;
    public static void m1(){
        class Inner{
            public void m2(){
                System.out.println("static method inner class");
                System.out.println(OuterStaticMethod.l);
                //System.out.println(OuterStaticMethod.k);//non-static method cannot be reference from static context
            }
        }
        Inner inner = new Inner();
        inner.m2();
    }

}
