



public class one_n_increasing {


    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;

        }
        System.out.print(n);
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=5;
    printDec(n);
    }
}
    

