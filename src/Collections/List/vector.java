package Collections.List;


import java.util.Iterator;
import java.util.Vector;

public class vector {
    public static void main(String args[]){
       Vector<String> list = new Vector<>();
        list.add("Ravi");
        list.add("vimala");
        list.add("Ravi");
        list.add("srinu");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
