package ch1.overload_override;

public class BobcatKitten extends Bobcat{
    public void findDean(){} // Override
    public void findDean(boolean b){} // Overload
    public int finddean() throws Exception {return 0;} // New method, not overload or override (diffrent name)
    // public int findDean(){return 0;} // DOES NOT COMPILE - Clash with already exisiting method , if it doesn't exist clashes with super class method (including return type)
}
