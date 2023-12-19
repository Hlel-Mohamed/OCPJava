package ch1.using_instanceof;

import ch1.using_instanceof.usage.*;

public class Test {
    public void testInstanceof (){
        HeavyAnimal hippo = new Hippo();
        // instanceof is an operator that returns true if the "object" has an IS-A relationship with the given "class"
        boolean b1 = hippo instanceof Hippo; // true
        boolean b2 = hippo instanceof HeavyAnimal; // true
        boolean b3 = hippo instanceof Elephant; // false
        boolean b4 = hippo instanceof Object; // true
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object; // false
        Hippo anotherHippo = new Hippo();
        // boolean b6 = anotherHippo instanceof Elephant; // DOES NOT COMPILE (compiler knows that Hippo and Elephant are not related because of reference)
        boolean b7 = hippo instanceof Mother; // false

        System.out.println(b7);
    }

    public void feedAnimal(Animal animal) {
        if (animal instanceof Cow) {
            ((Cow) animal).addHay();
        } else if (animal instanceof Bird) {
            ((Bird) animal).addSeed();
        } else if (animal instanceof Lion) {
            ((Lion) animal).addMeat();
        } else {
            throw new RuntimeException("Unsupported animal");
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        // test.testInstanceof();
        test.feedAnimal(new Cow());
        test.feedAnimal(new Bird());
        test.feedAnimal(new Lion());
        test.feedAnimal(new Animal());
    }
}
