package Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String args[]){
        PriorityQueue<String> q=new PriorityQueue<>();
        q.add("Kousi");
        q.add("Rama");
        q.add("Sita");
        q.add("anjaneya");
        q.peek();
        q.element();
        System.out.println("Peek"+q.peek());
        System.out.println("element"+q.element());
        Iterator itr=q.iterator();
        System.out.println("before removal");
        while(itr.hasNext()){

            System.out.print(itr.next()+"\t");
        }
        q.remove();
        q.poll();
        Iterator itr1=q.iterator();
        System.out.println();
        System.out.println("after removal:");
        while(itr1.hasNext()){

            System.out.print(itr1.next()+"\t");
        }
    }
}
