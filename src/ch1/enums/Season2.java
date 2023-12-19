package ch1.enums;

public enum Season2 {
    WINTER {
        public void printHours() { System.out.println("9am-3pm"); }
    },
    SUMMER {
        public void printHours() { System.out.println("9am-7pm"); }
    },
    SPRING{
        public void printHours() { System.out.println("9am-5pm"); }
    },
    FALL{
        public void printHours() { System.out.println("9am-5pm"); }
    };
    public abstract void printHours() ; // Requires every enum value to implement this method
}
