package ch1.nestedClasses.anonymousInnerClass;

public class AnnoInner2 {
    interface saleTodayOnly {
        int dollarsOff();
    }
    public int admission(int basePrice) {
        saleTodayOnly sale = new saleTodayOnly() {
            public int dollarsOff() { return 3; } // override the interface method
        };
        return basePrice - sale.dollarsOff();
    }
}
