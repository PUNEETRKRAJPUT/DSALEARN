package patterns;

public class triangle_0_1{

    public static void tri_0_1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print('1'+" ");
                }else{
                    System.out.print('0'+" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        tri_0_1(5);
    }
}
