package Scaler_Assignments_Problems.Carry_Forward.BulbsSwitch;

public class BulbSwitch{
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1};
        // int arr[] = {1, 1, 1, 1};

        //brute force approach TC: O(N^2) SC: O(1)
        // System.out.println("Press Switch : " + bruteForce(arr));

        // optimized approach TC: O(N) SC: O(1)
        System.out.println("Press Switch : " + optimizedApproach(arr));
    }

    public static int bruteForce(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
                count++;
                for(int j = i+1; j < arr.length; j++){
                    arr[j] = 1 - arr[j];
                }
            }
        }
        return count;
    }

    public static int optimizedApproach(int arr[]){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(ans%2 != 0){
                arr[i] = 1 - arr[i];
            }
            if(arr[i] == 0){
                arr[i] = 1;
                ans++;
            }
        }
        return ans;

    }

}