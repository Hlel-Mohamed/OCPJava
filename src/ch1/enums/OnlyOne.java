package ch1.enums;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b){
        System.out.println("constructing");
    }
    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE; // prints constructing
        OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
        // It only prints constructing once because enums are only constructed once
    }
}
