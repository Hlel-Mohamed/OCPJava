package ch1.equals_hashCode_toString;

public class Equals {
    /*
     equals is :
        - reflexive: x.equals(x) is true
        - symmetric: x.equals(y) is true if and only if y.equals(x) is true
        - transitive: if x.equals(y) is true and y.equals(z) is true, then x.equals(z) is true
        - consistent: multiple invocations of x.equals(y) consistently return true or consistently return false
        - null: x.equals(null) is false
     */
    public static void main(String[] args) {
        String s1 = new String("lion");
        String s2 = new String("lion");
        System.out.println(s1.equals(s2)); // true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2)); // false
        System.out.println(s1 == s2); // false
        System.out.println(sb1 == sb2); // false
        System.out.println(s1.equals(sb1)); // false
    }
}
