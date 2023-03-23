package arraylist;

import java.util.ArrayList;

public class mutli_araylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
      

        for (int i = 1; i <=5 ; i++) {
            list1.add(i*2);
            list2.add(i*3);
            list3.add(i*5);
            
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);
        
        for (int i = 0; i < mainlist.size(); i++) { /// here we need another curent list which stores the curnt list for printing
            ArrayList<Integer> current=mainlist.get(i);

            for (int j = 0; j <current.size(); j++) {
                System.out.print(current.get(j)+" ");
            }            
            System.out.println();
        }
    }
}
