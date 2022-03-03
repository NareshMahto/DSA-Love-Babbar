/* Check whether a String is Palindrome or not.
--------------------------------------------------
aabbcc == true
nbadde == false

using while loop by comparing first and last element of char array
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
        int s = 0, e = n-1;
        while(s < e){
            if(ch[s] != ch[e]){
                return "false";
            }
            s++;
            e--;
        }
        return "true";
    }
}
