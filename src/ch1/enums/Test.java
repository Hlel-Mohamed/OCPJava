package ch1.enums;

public class Test {

    static void testEnum(){
        Season1 s = Season1.SUMMER;
        System.out.println(Season1.SUMMER); // SUMMER
        System.out.println(s); // SUMMER
        System.out.println(s.name()); // SUMMER
        System.out.println(s.ordinal()); // 2
        System.out.println(s == Season1.SUMMER); // true

        for (Season1 season1 : Season1.values()) {
            System.out.println(season1.name() + " " + season1.ordinal());
        }
        // System.out.println(Season1.SUMMER == "SUMMER"); // DOES NOT COMPILE
        Season1 s1 = Season1.valueOf("SUMMER"); // SUMMER
        Season1 s2 = Season1.valueOf("summer"); // java.lang.IllegalArgumentException
    }

    static void useEnumsInSwitch(){
        Season1 summer = Season1.SUMMER;
        switch (summer) {
            // case Season1.WINTER: // DOES NOT COMPILE
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
    public static void main(String[] args) {
        // testEnum();
        // useEnumsInSwitch();
        Season1.SUMMER.printExpectedVisitors(); // High
    }
}
