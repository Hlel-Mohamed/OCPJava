package ch1.virtualMethodInvocation;

import ch1.virtualMethodInvocation.method.*;

public class Test {
    // Virtual method invocation
    // The JVM determines the proper method to call at runtime,
    // virtual methods are used almost exclusively in the context of overriding.
    public void feedAnimal(Animal animal) {
        animal.feed();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.feedAnimal(new Lion());
        t.feedAnimal(new Cow());
        t.feedAnimal(new Bird());
    }
}
