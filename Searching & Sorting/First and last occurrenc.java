/*
Given a sorted array arr containing n elements with possibly duplicate elements, 
the task is to find indexes of first and last occurrences of an element x in the given array.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last
             occurrence of 5 is at index 5. 
 

Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6 

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. 
You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.
Note: If the number x is not found in the array just return both index as -1.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 107
*/

import java.util.*;
class FirstandLast{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int t = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int ans[] = firstandLast( arr, n, t);
            System.out.print(ans[0] + " " + ans[1]);
    }
    static int[] firstandLast(int arr[], int n, int t){
        int ans[] = {-1, -1};
        int lo = 0;
        int hi = n-1;
        // to find first index
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if (arr[mid] == t){
                ans[0] = mid;
                hi = mid-1;
            } else if (arr[mid] < t){
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        lo = 0;
        hi = n-1;
        // to find last index
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if (arr[mid] == t){
                ans[1] = mid;
                lo = mid+1;
            } else if (arr[mid] < t){
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return ans;
    }
}
