package ch1.virtualMethodInvocation.method;

public class Cow extends Animal{
    public void feed() {addHay();}
    private void addHay() {
        System.out.println("Cow.addHay()");
    }
}
