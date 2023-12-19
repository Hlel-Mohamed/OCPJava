package ch1.nestedClasses.anonymousInnerClass;

public class AnonInner {
    /*
        Anonymous inner classes are local inner classes that do not have a name.
        They have to extend an existing class or implement an existing interface.
     */
    abstract class SaleTodayOnly { // member inner class
        abstract int dollarsOff();
    }

    public int pay() {
        return admission(5);
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() { // anonymous inner class
            // Can only extend one class or implement one interface
            int dollarsOff() { return 3; } // override the abstract class method
        };
        return basePrice - sale.dollarsOff();
    }
}
