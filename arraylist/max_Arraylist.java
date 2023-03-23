package arraylist;
import java.util.*;

public class max_Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer>list1=new ArrayList<>(); 
        list1.add(1);//O(1)
        list1.add(2);
        list1.add(3);
        list1.add(6);//O(1)
        list1.add(7);
        list1.add(9);
        list1.add(510);

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            if(max < list1.get(i)){
                max=list1.get(i);
            }
            // another way
            max= Math.max(max,list1.get(i));
        }

        System.out.println(max+ " ");
        
    }
}
