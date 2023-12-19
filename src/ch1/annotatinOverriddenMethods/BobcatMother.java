package ch1.annotatinOverriddenMethods;

public class BobcatMother extends Bobcat{
    @Override public void findDen() { }
    //@Override public void findDen(boolean b) { } // DOES NOT COMPILE , Compiler knows you want to override a method, but you're overloading, so it complains.
}
