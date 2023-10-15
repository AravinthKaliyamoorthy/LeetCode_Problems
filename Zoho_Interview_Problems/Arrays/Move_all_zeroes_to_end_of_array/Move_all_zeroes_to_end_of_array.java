package Zoho_Interview_Problems.Arrays.Move_all_zeroes_to_end_of_array;

import java.util.Arrays;

public class Move_all_zeroes_to_end_of_array {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int arr[] = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};

        // brute force approach TC: O(N^2) SC: O(N)
        // bruteForce(arr, arr.length);

        // optimizedApproach(arr, arr.length);

        moveZeroes(arr);
        System.out.println("Result : " + Arrays.toString(arr)); // TC: O(N) SC: O(1)
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

    public static void moveZeroes(int[] nums) {
        int zeroIndex = -1, zeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(zeroIndex == -1){
                    zeroIndex = i;
                }
                else{
                    zeroCount++;
                }
            }
            if(nums[i] != 0 && zeroIndex != -1){
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                if(zeroCount != 0){
                    zeroIndex++;
                }
                else{
                    zeroIndex = i;
                }
            }
        }
    }
}
