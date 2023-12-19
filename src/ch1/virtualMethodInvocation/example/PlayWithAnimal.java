package ch1.virtualMethodInvocation.example;

public class PlayWithAnimal {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.careFor(); // toss in meat
        // Calling careFor() on the Animal reference uses the Lion version of the method.
        animal.play(); // toss in meat
        // Calling play() on the Animal reference uses the Lion version of the method.
    }
}
