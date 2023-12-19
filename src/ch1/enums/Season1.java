package ch1.enums;

public enum Season1 { // Cannot extend another enum or class, but can implement interfaces
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;
    private Season1(String expectedVisitors){ // Cannot be public or protected
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}
