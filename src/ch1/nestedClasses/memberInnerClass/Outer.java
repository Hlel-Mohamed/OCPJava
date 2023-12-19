package ch1.nestedClasses.memberInnerClass;

public class Outer {
    /*
        Member inner classes :
        - Can be declared public, private, or protected or use default access
        - Can extend any class and implement interfaces
        - Can be abstract or final
        - Cannot declare static fields or methods
        - Can access members of the outer class including private members
    */
    private String greeting = "Hi";

    protected class Inner { // Same level as instance variables, constructors, and methods
        public int repeat = 3;
        public void go(){
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        // outer.callInner();
        Inner inner = outer.new Inner();
        inner.go();
    }

    /*
        Compiling the Outer class generates two class files:
        Outer.class and Outer$Inner.class
    */
}
