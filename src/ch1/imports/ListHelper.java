package ch1.imports;

// import java.util.*; // import all classes in java.util (List, ArrayList, Collections) (wildcard)
import java.util.ArrayList; // import ArrayList class
import java.util.List; // import List class
// import static java.util.Collections.*; // static import of all methods and variables from Collections class (wildcard)
import static java.util.Collections.sort; // static import of sort method from Collections class
import java.lang.*; // redundant import (implicit import)

public class ListHelper {
    public List <String> copyAndSortList(List <String> original) {
        List <String> list = new ArrayList <String> (original);
        sort(list);
        return list;
    }
}
