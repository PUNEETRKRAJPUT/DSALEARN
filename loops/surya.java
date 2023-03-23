package loops;
import java.util.*;



public class surya {

    // febo series  1 2  3  5  8  13  21  34
                   
   
    public static void main(String[] args) { /// jvm
       
        Scanner sc= new Scanner(System.in);
        int count = sc.nextInt();// 4 input liya maan le
        int n1 =0;
        int n2=1;
        int n3;

        System.out.print(n1 +" "+n2);  //output result yaha tk 0 1
        for (int i = 2; i < count; i++) {  // 2<4 yes -- i++ 3<4
            
            n3 =n1+n2; // n3= 0+1= 1 now i 3<4 n3=1 ab n3=2
            System.out.print(" " + n3);
            n1=n2 ;// pehle 0 ab n1=1 
            n2 =n3;// pehle 1 ab n2=1
            
        }
// output = 0 1 1 2

        
      

    
    }
}
