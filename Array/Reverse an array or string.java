/*
Write a program to reverse an array or string
--------------------------------------------------
Array-->  12345 == 654321
String--> geeks == skeeg
  The optomized approach is swapping first element to last element
do repeat until mid element.
--> take array length.
--> take first index.
--> take last index.
--> swap first with lase.
--> repeat until mid.
*/

//Write a program to reverse an array or string
import java.util.*;
class ReverseArrayString{
    public static void main (String args[]){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t --> 0){
            String str = sc.nextLine();
            System.out.println(reverse(str));
        }
    }
    public static String reverse(String str){
        int n = str.length();
        if (n == 0){
            return "";
        }
        int s = 0, e = n-1;
        char[] ch =  str.toCharArray();
        while (s < e){
            char c = ch[s];
            ch[s] = ch[e];
            ch[e] = c;
            s++;
            e--;
        }
        return new String(ch);
    }
}
