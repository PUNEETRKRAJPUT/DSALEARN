package patterns;

public class butterfly {
    

    public static void butt(int n){

        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");     
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //for second half  these patterns just to help in understansing the liooops
        for(int i=n;i>=0;i--){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");     
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
         
         
    }
    public static void main(String[] args) {
        
        butt(4);
    }
}
