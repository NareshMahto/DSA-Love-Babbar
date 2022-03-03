/* Check whether a String is Palindrome or not.
---------------------------------------------------
aabbcc == true
nbadde == false

using for loop by comparing first element to last 
but loop runs only till n/2 so its optimized
*/
import java.util.*;
class StringPalindrome{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(stringPalindrome(s));
    }

    public static String stringPalindrome(String str){
        int n = str.length();
        char[] ch = str.toCharArray();
        int e = n-1;
        for(int i=0; i<n/2; i++){
            if (ch[i] != ch[e]){
                return "false";
            }
            e--;
        }
        return "true";
    }
}
