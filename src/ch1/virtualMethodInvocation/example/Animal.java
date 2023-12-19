package ch1.virtualMethodInvocation.example;

public abstract class Animal {
    public void careFor() {
        play();
    }
    public void play() {
        System.out.println("pet animal");
    }
}
