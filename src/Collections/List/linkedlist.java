package Collections.List;
import java.util.LinkedList;
import java.util.Iterator;

public class linkedlist {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
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