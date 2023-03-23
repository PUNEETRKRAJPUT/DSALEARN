package backtracking;

public class find_permutations {

    //base case
    public static void  permutations(String str ,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) 
        {
            char curr=str.charAt(i);
            // abcde => 'ab'+'de'= "abcd"
            String newstr =str.substring(0,i)+str.substring(i+1);// in substring i is not inclusive and if we dont pass two para in substr it means till end
            permutations(newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        permutations(str, "");
    }
}
