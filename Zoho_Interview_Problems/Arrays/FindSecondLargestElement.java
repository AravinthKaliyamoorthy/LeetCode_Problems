package Zoho_Interview_Problems.Arrays;

import java.util.*;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        // int arr[] = {12, 35, 1, 10, 34, 1};
        // int arr[] = {10, 5, 10};
        int arr[] = {10, 10, 10};
        // brute force approach -> TC: O(N^2) SC: O(1)
        // sorting the array by ascending order and taking n-2 element in the array
        bruteForce(arr, arr.length);

        // optmized approach -> TC: O(N) SC: O(1)
        // Iterate element from i = 0 to N - 1 and find maximum element then running the loop again from 
        // i = 0 to N - 1 and find the second largest element using if firstMax != arr[i] && secondMax < arr[i]
        optimizedApproach(arr, arr.length);
    }

    public static void bruteForce(int arr[], int arraySize){
        for(int i = 0; i < arraySize; i++){
            for(int j = i+1; j < arraySize; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] != arr[arr.length-1]){
                System.out.println("Brute Force Approach -> Second Largest Element in the Array is : " + arr[i]);
                return;
            }
        }
        System.out.println("There is no second largest element");
        // System.out.println("Array after sorting : " + Arrays.toString(arr));
    }

    public static void optimizedApproach(int arr[], int arraySize){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        if(arraySize < 2){
            System.out.println("There is no second largest element");
        }
        for(int i = 0; i < arraySize; i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        if(second != Integer.MIN_VALUE){
            System.out.println("Optimized Approach -> Second largest element in the array : "+second);
        }
        else{
            System.out.println("There is no second largest element");
        }
    }

}
