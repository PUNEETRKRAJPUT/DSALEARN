package arraylist;
import java.util.*;

public class sort_arraylist {
    public static void main(String[] args) {
        // collections.sort (list) sorts the array list like arrays 
             
    ArrayList <Integer> list = new ArrayList<>();
    list.add(34);
    list.add(125);
    list.add(2);
    list.add(135);
    list.add(22);
  
    System.out.println(list);
    
    Collections.sort(list);
    System.out.println(list);

    // descending sort
    Collections.sort(list,Collections.reverseOrder());
    //reverse order is a comparator that is a functions with the logic how should the things be sorted
    System.out.println(list);

    }
}
