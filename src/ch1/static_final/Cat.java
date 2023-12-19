package ch1.static_final;

abstract class Cat {
    final static String name = "The Cat";
    // final void clean() {} // DOES NOT COMPILE (final stops a method from being overridden)
    static void clean() {} // static can be added to both method but then there is no inheritence
}
