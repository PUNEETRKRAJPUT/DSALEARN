package patterns;

public class sbai {
    public static void ramesh(int n){
        for (int i = 1; i <= n; i++) {// outer loop
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n=5;
        ramesh(n);
    }
}
