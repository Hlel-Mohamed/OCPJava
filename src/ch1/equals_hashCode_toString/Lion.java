package ch1.equals_hashCode_toString;

public class Lion{
    private int idNumber;
    private int age;
    private String name;
    public Lion(int idNumber, int age, String name){
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Lion)) return false;
        Lion otherLion = (Lion) obj;
        return this.idNumber == otherLion.idNumber;
        // return EqualsBuilder.reflectionEquals(this, obj); // Apache Commons Lang
    }

    /*
        public boolean equals (Object obj){
            if(!(obj instanceof Lion)) return false;
            Lion otherLion = (Lion) obj;
            return new EqualsBuilder().appendSuper(super.equals(obj))
                                      .append(idNumber, otherLion.idNumber)
                                      .append(age, otherLion.age)
                                      .append(name, otherLion.name)
                                      .isEquals();
        } // Apache Commons Lang
    */

    public boolean equals(Lion otherLion){ // overloaded equals method not overriding
        return this.idNumber == otherLion.idNumber;
    }
}
