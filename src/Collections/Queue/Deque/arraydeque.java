package Collections.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class arraydeque {
    public static void main(String agrs[]){
        Deque<String> Ad=new ArrayDeque<>();
        Ad.add("Goutham");
        Ad.add("kousi");
        Ad.add("Satish");
        Ad.add("Satish");
        for(String str:Ad){
            System.out.println(str);
        }
    }
}
