package arraylist;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
       // ArrayList<Boolean> list2= new ArrayList<>();
       // ArrayList<String> list3= new ArrayList<>();
        
        /*time complexity for the array list are as follow
         * add element = O(1) 
         * get element = O(1)
         * remove element = O(n)
         * set element at index = O(n)
         * contains element at index = O(n)
        */
        // for adding the values to the arraylist use .add() method
        
        // for adding the elements to the arraylist
        list1.add(1);//O(1)
        list1.add(2);
        list1.add(3);
        list1.add(5);
        System.out.println(list1);
        //for getting the elements from the arraylist use .get() method
        int element = list1.get(1);
        System.out.println(element);
        //for removing the elements from the arraylist use .remove() method
        list1.remove(3);
        System.out.println(list1);
        // for setting the element on the given index
        list1.set(2,10);
        System.out.println(list1);
        // for checking the given element present in the list or not
        // you need to pass the value not the index
        System.out.println(list1.contains(10));//as it is a boolean type method so you have the handle the return value in seperate variable or direct print it

        // another way to add the element to the the arraylist by direct giving the index
        list1.add(3,12);
        System.out.println(list1);

        // for printing the arraylist
        for (int i = 0; i<list1.size(); i++) {
            System.out.println(list1.get(i));
            
        }

    }
}
