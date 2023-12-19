package ch1.virtualMethodInvocation.method;

public class Lion extends Animal{
    public void feed() {addMeat();}
    private void addMeat() {
        System.out.println("Lion.addMeat()");
    }
}
