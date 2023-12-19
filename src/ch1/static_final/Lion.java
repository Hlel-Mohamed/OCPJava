package ch1.static_final;

public final class Lion extends Cat{ // final stops inheritence
    final static void clean() {} // final is redundant here because the method is static

    public static void main(String[] args) {
        System.out.println(Cat.name); // Can access static final variable directly
        Cat.clean(); // Can access static method directly
    }
}
