package ch1.virtualMethodInvocation.method;

public class Bird extends Animal{
    public void feed() {addSeed();}
    private void addSeed() {
        System.out.println("Bird.addSeed()");
    }
}
