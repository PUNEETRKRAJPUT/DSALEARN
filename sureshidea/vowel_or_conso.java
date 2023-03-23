package sureshidea;
import java.util.*;


public class vowel_or_conso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char chr=sc.next().charAt(0);
        //97, 101, 105, 111, and 117  65, 69, 73, 79, and 85
      int asci=(int) chr;
        if(asci==97 || asci==101 || asci==105 || asci==111 || asci==117 || asci==65 || asci==69 || asci==73 || asci==79 || asci==85){
            System.out.println("vowel");
        }else{
            System.out.println("conso");
        }

    }
    
}
