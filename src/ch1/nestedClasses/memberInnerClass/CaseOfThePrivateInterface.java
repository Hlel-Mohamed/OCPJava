package ch1.nestedClasses.memberInnerClass;

public class CaseOfThePrivateInterface {
    private interface Secret {
        public void shh();
    }

    class DontTell implements Secret {
        public void shh() {
            System.out.println("Shh");
        }
    }
}
