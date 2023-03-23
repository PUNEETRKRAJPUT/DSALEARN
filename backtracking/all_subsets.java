package backtracking;

public class all_subsets {

    public static void find_all_subsets(String str , String ans , int i){
        if(i==str.length()){
            if(ans.length()==0)
            {
                System.out.println("NULL");

            }else{
                System.out.println(ans);
            }
            return;

        }
        // yes choices
        find_all_subsets(str, ans+str.charAt(i), i+1);
        // no choices
        find_all_subsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        find_all_subsets(str, "", 0
        );
        
    }
}
