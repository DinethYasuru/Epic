package Stramings;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_Runner {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int x=0; x<100;x++)
        list.add(x);

        ArrayList<Integer> list2= (ArrayList<Integer>) list.stream().filter(i->i==5 || i>10).collect(Collectors.toList());
        System.out.println(list2);
    }
}
