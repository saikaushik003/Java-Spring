package Basics;


import java.util.*;


public class Demo {

    public static void main(String[] args) throws InterruptedException{
        List<Integer> w = new ArrayList<>();
        w.add(5);
        w.add(8);
        w.add(2);
        
        Iterator it = w.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}