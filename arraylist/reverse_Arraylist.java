package arraylist;
 import java.util.*;
public class reverse_Arraylist {
    public static void main(String[] args) {
       ArrayList <Integer> list1 = new ArrayList<Integer>();
        list1.add(1);//O(1)
        list1.add(2);
        list1.add(3);
        list1.add(5);
        for (int  i=list1.size()-1; i>=0 ;i--) {
            System.out.println(list1.get(i));
            
        }
        
    }
}
