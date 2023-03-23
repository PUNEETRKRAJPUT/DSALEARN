package sorting;

public class bubble {

    public static void bubble_sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {59,54,45,55,63,49,11,35,26,29,30,34,56,41,53,32,2,14,46,50,65,17,66,25,27,40,4
            ,21,23,1,8,19,16,6,7,15,39,37,33,11,38,20,31,36,22,3,20,24,52,51,28,13,5};
        bubble_sort(arr);
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
    }
    
}
