package Scaler_Assignments_Problems.Sub_Array.CountingSubarrayWithLessSum;

public class CountingSubarrayWIthLessSum{
    public static void main(String[] args) {
        // int arr[] = {2, 5, 6};
        int arr[] = {10,5,2,6};
        int arraySize = arr.length;
        int B = 100;

        // brute force approach using nested loops TC: O(N^2) SC: O(1)
        // bruteForce(arr, arraySize, B);

        // optimized approach for subarray sum using carry forward TC: O(N) SC: O(1)
        // optimize(arr, arraySize, B);

        // optimized approach for subarray product using carry forward TC: O(N) SC: O(1)
        optimizeProduct(arr, arraySize, B);
    }

    public static void bruteForce(int arr[], int arrarySize, int B){
        int count = 0;
        for(int i = 0; i < arrarySize; i++){
            int sum = 1;
            for(int j = i; j < arrarySize; j++){
                sum *= arr[j];
                if(sum >= B){
                    break;
                }
                count++;
            }
        }
        System.out.println(count + " subarray sum has less than B");
    }

    public static void optimize(int A[], int arraySize, int B){
        int count = 0;
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < A.length; end++) {
            currentSum += A[end];

            while (currentSum >= B && end <= start) {
                currentSum -= A[start];
                start++;
            }

            count += (end - start + 1);
        }

        System.out.println(count);
    }

    public static void optimizeProduct(int nums[], int arraySize, int B){
        int currentSum = 1, count = 0, start = 0;
        for(int i = 0; i < arraySize; i++){
            currentSum *= nums[i];
            while(currentSum >= B && start <= i){
                currentSum /= nums[start];
                start++;
            }
            count += (i - start + 1);
        }
        System.out.println(count);
    }
}