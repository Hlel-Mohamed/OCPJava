package ch1.nestedClasses.staticNestedClass;

public class Enclosing {
    /*
        Static nested classes :
        - are like regular classes except they are defined within another class
        - are not an inner class, they are a static member of the enclosing class
        - can be instantiated without an object of the enclosing class
        - can access static members of the enclosing class including private ones
        - cannot access instance variables or methods of the enclosing class
     */
    public static int balance = 0;
    static class Nested {
        //balance = 5; // Cannot access members of Enclosing directly
        public void print() {
            System.out.println(balance);
            System.out.println(new Enclosing().balance);
        }
        private int price = 6;
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price); // Doesn't need an instance of Enclosing
    }
}
