package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String args[]){
        Comparator<Integer> com=(i,j)->i>j?1:-1;
        List<Integer> list=new ArrayList<>();
        list.add(43);
        list.add(21);
        list.add(32);
        list.add(12);
        Collections.sort(list,com);
        System.out.println(list);
    }
}
