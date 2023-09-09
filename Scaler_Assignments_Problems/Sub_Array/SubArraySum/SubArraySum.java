package Scaler_Assignments_Problems.Sub_Array.SubArraySum;

import java.util.*;

public class SubArraySum{
    public static void main(String[] args) {
        int arr[] = {8, 6, 5};
        
        //bruteforce approach with prefix sum array TC: 0(n^3) SC: O(n)
        // bruteForce(arr, arr.length);

        //optimized approach with carry forward varible TC: O(n^2) SC: O(1)
        optimized(arr, arr.length);
    }

    public static void bruteForce(int arr[], int arraySize){
        int prefix[] = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            if(i == 0){
                prefix[i] = arr[i];
            }
            else{
                prefix[i] =  prefix[i-1] + arr[i];
            }
        }
        System.out.println("Prefix Sum Array : " + Arrays.toString(prefix));
        for(int i = 0; i < arraySize; i++){
            for(int j = i; j < arraySize; j++){
                if(i == 0){
                    System.out.println(prefix[j]);
                }
                else{
                    System.out.println(prefix[j] - prefix[i-1]);
                }
            }
        }
    }

    public static void optimized(int arr[], int arraySize){
        int sum = 0;
        for(int i = 0; i < arraySize; i++){
            sum = 0;
            for(int j = i ; j < arraySize; j++){
                sum += arr[j];
                System.out.println(sum);
            }
        }        
    }
}