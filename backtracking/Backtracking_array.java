package backtracking;

public class Backtracking_array {

    public static void changearr(int arr[] ,int i,int value){

        // base
        if(i==arr.length){
            print(arr);
            return ;
        }

        // recursion

        arr[i]=value;
        changearr(arr, i+1, value+1);
        arr[i] =arr[i]-2;
    }
    
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = new int [5];
        changearr(arr,0,1);
        print(arr);
    }
}
