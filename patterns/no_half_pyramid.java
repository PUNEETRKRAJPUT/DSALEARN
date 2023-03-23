package patterns;

public class no_half_pyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){// outer loop starts


//////////////////////////////////////////////
            for(int j=1;j<=i;j++){//inner loop starts
               
                System.out.print("*");
                
            }//inner loop ends

//////////////////////////////////////
            System.out.println();
        }//outer loop ends
    }
}
