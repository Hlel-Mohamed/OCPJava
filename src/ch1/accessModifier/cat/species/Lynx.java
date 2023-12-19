package ch1.accessModifier.cat.species;

import ch1.accessModifier.cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        // System.out.println(cat.hasFur);// DOES NOT COMPILE
        // System.out.println(cat.hasPaws); // DOES NOT COMPILE
        //System.out.println(cat.id); // DOES NOT COMPILE
    }
}
