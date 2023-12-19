package ch1.virtualMethodInvocation.variable;

import ch1.virtualMethodInvocation.variable.Animal;

public class PlayWithAnimal {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName(); // ???
        // Calling printName() on the Animal reference uses the Animal version of the variable.
    }
}
