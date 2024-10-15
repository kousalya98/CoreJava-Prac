package Collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
        public static void main(String args[]){
       Set<String> set=new LinkedHashSet<>();
            set.add("Rav");
            set.add("Vijay");
            set.add("Ravi");
            set.add("Ajay");
            Iterator<String> itr=set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }

    }
