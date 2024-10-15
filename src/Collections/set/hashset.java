package Collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
        public static void main(String args[]){
            Set<String> set=new HashSet<>();
            set.add("Ravi");
            set.add("Vijay");
            set.add("Ravi");
            set.add("Ajay");
            Iterator<String> itr=set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());

        }
    }
}
