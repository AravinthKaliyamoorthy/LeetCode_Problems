package Scaler_Assignments_Problems.Carry_Forward.LeadersArray;

public class FindHowManyLeadersInArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};

        // brute force -> TC: O(N^2) SC: O(1)
        bruteForce(arr);
    }

    public static void bruteForce(int arr[]){
        int leader = 0;
        boolean leaderFlag = true;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    leaderFlag = false;
                    break;
                }
            }
            if(leaderFlag){
                leader++;
            }
        }
        System.out.println("How Many leaders in this array is : " + leader);
    }
}
