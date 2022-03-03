/* Write a function that reverses a string. The input string is given as an array of characters s.
--------------------------------------------------------------------------------------------------------
naresh == hseran
aabbcc == ccbbaa
usig temp variable
*/

import java.util.*;
class ReverseString{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
    public static String reverseString(String str){
        char[] ch = str.toCharArray(); // string to char array
        int i = 0, j = str.length()-1;
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }   
        return new String(ch);  // char array to string
    }
}
