package ch1.equals_hashCode_toString;


public class Hippo {
    private String name;
    private double weight;
    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        // return name;
        return "Name: " + name + ", Weight: " + weight;
        // return ToStringBuilder.reflectionToString(this); // Apache Commons Lang
    }

    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3100);
        System.out.println(h1);
    }

}
