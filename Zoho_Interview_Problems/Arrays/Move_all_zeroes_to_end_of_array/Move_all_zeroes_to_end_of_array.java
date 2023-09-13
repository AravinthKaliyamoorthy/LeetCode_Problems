package Zoho_Interview_Problems.Arrays.Move_all_zeroes_to_end_of_array;

import java.util.Arrays;

public class Move_all_zeroes_to_end_of_array {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int arr[] = {1, 2, 0, 0, 0, 3, 6};

        // brute force approach TC: O(N^2) SC: O(N)
        // bruteForce(arr, arr.length);

        optimizedApproach(arr, arr.length);
    }    

    public static void bruteForce(int arr[], int arraySize){
        int position = 0;
        int result[] = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            if(arr[i] != 0){
                result[position] = arr[i];
                position++;
            }
        }
        System.out.println("Result : " + Arrays.toString(result));
    }

    public static void optimizedApproach(int arr[], int arraySize){
        int zeroCount = 0;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] != 0){
            arr[zeroCount++] = arr[i];
           }
        }
        while(zeroCount < arr.length){
            arr[zeroCount++] = 0;
        }
        System.out.println("Result : " + Arrays.toString(arr));
    }
}
