package Collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeset {
    public static void main(String args[]){
//Creating and adding elements
        SortedSet<String> set=new TreeSet<>();
        set.add("Rai");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//traversing elements
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
