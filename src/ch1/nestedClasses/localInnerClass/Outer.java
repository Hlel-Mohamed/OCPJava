package ch1.nestedClasses.localInnerClass;

public class Outer {
    /*
        Local inner classes :
        - do not have an access specifier
        - cannot be declared static and cannot declare static fields or methods
        - have access to all fields and methods of the enclosing class
        - do not have access to local variables of a method unless those variables are final or effectively final
     */

    private int length = 5;
    public void calculate() {
        final int width = 20;
        class Inner { // Defined inside a method
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }
}
