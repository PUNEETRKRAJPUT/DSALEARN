package sureshidea;


import java.util.*;


public class check_alpha_digit_spe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char chr=sc.next().charAt(0);
        //97, 101, 105, 111, and 117  65, 69, 73, 79, and 85
      int asci=(int) chr;
        if(asci==97 ){
            System.out.println("vowel");
        }else{
            System.out.println("conso");
        }

    }
    
}
// alpha digit and special
