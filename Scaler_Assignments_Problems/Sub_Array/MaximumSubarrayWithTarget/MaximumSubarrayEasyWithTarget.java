package Scaler_Assignments_Problems.Sub_Array.MaximumSubarrayWithTarget;

public class MaximumSubarrayEasyWithTarget {
    public static void main(String[] args) {
        // int arr[] = {2, 1, 3, 4, 5};
        int arr[] = {2, 2, 2};
        int arraySize = 3, B = 1, sum = 0, maxSum = 0;
        for(int i = 0; i < arraySize; i++){
            sum = 0;
            for(int j = i; j < arraySize; j++){
                sum += arr[j];
                if(sum >= maxSum && sum <= B){
                    maxSum = sum;
                }
            }
        }
        System.out.println("MaxSum : "+maxSum);
    }
}