package Test2;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorTest {
    public static void main(String[] args) { 
        ArrayList<String> number_list = new ArrayList<String>(); 
        number_list.add("num_1"); 
        number_list.add("num_2"); 
        System.out.print("[Iterator Loop] "); 
        Iterator<String> iter = number_list.iterator(); 
        while(iter.hasNext()){
            System.out.print(iter.next() + " "); 
        } 
    } 

}