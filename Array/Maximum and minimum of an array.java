/*
Maximum and minimum of an array using minimum number of comparisons
-------------------------------------------------------------------
METHOD 1 (Simple Linear Search) 
Initialize values of min and max as minimum and maximum of the first two elements respectively. 
Starting from 3rd, compare each element with max and min, and change 
max and min accordingly (i.e., if the element is smaller than min then change min, 
else if the element is greater than max then change max, else ignore the element) 
*/

import java.util.*;
class MinMaxArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for( int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Pair minmax = getMinMax(arr, n);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    }
    static class Pair {
        int min;
        int max;
    }
    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        int i;

        if (n == 1){
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        if (arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else{
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for ( i=2; i<n; i++){
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
} 
