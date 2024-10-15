package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<String> list= new ArrayList<>();
        list.add("Ravi");
        list.add("vimala");
        list.add("Ravi");
        list.add("srinu");
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
