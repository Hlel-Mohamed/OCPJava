package ch1.nestedClasses.anonymousInnerClass;

public class AnnoInner3 {
    interface saleTodayOnly {
        int dollarsOff();
    }
    public int pay() {
        return admission(5, new saleTodayOnly() {
            public int dollarsOff() { return 3; }
        });
    }
    public int admission(int basePrice, saleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
}
