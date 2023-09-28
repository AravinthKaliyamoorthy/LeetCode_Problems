package LeadersArray;

public class FindHowManyLeadersInArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};

        // brute force -> TC: O(N^2) SC: O(1)
        // every i index checking whether that element is greater than of j=i+1 to N-1. 
        bruteForce(arr);

        // optimized approach -> TC: O(N) SC: O(1)
        optimizedApproach(arr);

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
            leaderFlag = true;
        }
        System.out.println("How Many leaders in this array is : " + leader);
    }

    public static void optimizedApproach(int arr[]){
        int max = arr[arr.length-1], leader = 1;
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] > max){
                leader++;
                max = arr[i];
            }
        }
        System.out.println("How Many leaders in this array is : " + leader);
    }
}
