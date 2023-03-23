package sureshidea;

import javax.swing.SpringLayout;

public class increament_dec {
    public static void main(String[] args) {
        int i=19 , j=29, k;
        k= i-- + --j - ++j + --i - j-- + ++i - j++;
        
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
