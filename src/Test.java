public class Test {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner outInner = outer.new Inner();
        outInner.m1();
        //second way of accessing inner class metod
        new Outer().new Inner().m1();
        //third way of accessing the inner class method
        Outer.Inner inner  =  new Outer().new Inner();
        inner.m1();

    }
}