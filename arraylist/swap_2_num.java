package arraylist;
import java.util.*;
public class swap_2_num {

    public static void swap(ArrayList<Integer> list , int idx , int idx2){

        int temp=list.get(idx);
        list.set(idx, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }

    public static void main(String[] args) {
       
      
    ArrayList <Integer> list = new ArrayList<>();
    list.add(2);
    list.add(7);
    list.add(22);
    list.add(34);
    list.add(125);
    
    int idx = 0;
    int idx2=2;
    System.out.println(list);
    swap(list, idx,idx2);
        
        
        
    }
    
}
