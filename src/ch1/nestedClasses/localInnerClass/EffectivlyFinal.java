package ch1.nestedClasses.localInnerClass;

public class EffectivlyFinal {

    // local variables are not accessible to the inner class unless they are final or effectively final
    public void isItFinal() {
        int one = 20; // Effectively final
        int two = one; // Effectively final
        two++; // Not effectively final
        int three; // Effectively final
        if (one == 4) three = 3; // Effectively final
        else three = 4; // Effectively final
        int four = 4; // Effectively final
        class Inner {
            public void multiply() {
                // System.out.println(one * two * three * four); // DOES NOT COMPILE
                // Cannot use two and four because they are not effectively final
            }
        }
        four = 5; // Not effectively final
        Inner inner = new Inner();
        inner.multiply();
    }
}
