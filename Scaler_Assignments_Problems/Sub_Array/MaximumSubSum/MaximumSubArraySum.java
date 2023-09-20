package MaximumSubSum;

import java.util.*;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[] = {-1, 2, -1, 3, -1, -4, -2, -1, 7, -2};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        //brute force approach -> TC: O(N^2) SC: O(1)
        // bruteForce(arr, arr.length);

        //optimized approach -> TC: O(N) SC: O(1)
        // optimizedApproach(arr, arr.length);
    }

    public static void bruteForce(int arr[], int arraySize){
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < arraySize; i++){
            sum = 0;
            for(int j = i; j < arraySize; j++){
                sum += arr[j];
                if(sum >= maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum subarray sum : "+maxSum);

    }

    public static void optimizedApproach(int arr[], int arraySize){
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i = 1; i < arraySize; i++){
            // if the current sum is negative means if you sum with i element it becomes less i index 
            // element so butter to i index element as current sum it makes as new subarray starting here
            if(currSum < 0){
                currSum = arr[i];
            }
            else{
                currSum += arr[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum subarray sum : "+maxSum);
    }

}
