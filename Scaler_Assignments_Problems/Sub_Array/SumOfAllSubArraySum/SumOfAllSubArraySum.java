package SumOfAllSubArraySum;

public class SumOfAllSubArraySum {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3};

        // Brute Force Approach TC: O(N^2) SC: O(1)
        // Travel all subarrays and calculate sum
        bruteForce(arr, arr.length);

        // Optimized Approach TC: O(N) SC: O(1)
        // Every Index checking how many time it's possible to come in subarray with 
        // respective we are multipling with that element.
        optimizedApproach(arr, arr.length);
    }

    public static void bruteForce(int arr[], int arraySize){
        int sum = 0;
        for(int i = 0; i < arraySize; i++){
            int currSum = 0;
            for(int j = i; j < arraySize; j++){
                currSum += arr[j];
                sum += currSum;
            }
        }
        System.out.println("Sum of all subArray: " + sum);
    }

    public static void optimizedApproach(int arr[], int arraySize){
        int ans = 0;
        for(int i = 0; i < arraySize; i++){
            ans += arr[i] * (i+1) * (arraySize-i); 
        }
        System.out.println("Sum of all subarrays : " +  ans);
    }

}
