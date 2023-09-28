package EvenSubarrays;

public class EvenSubarrays {
    public static void main(String[] args) {
        // int arr[] = {2, 4, 8, 6};
        int arr[] = {2, 4, 8, 7, 6};

        //brute force approach
        bruteForce(arr, arr.length);
    }    

    public static void bruteForce(int arr[], int arraySize){
        int ans = 0;
        for(int i = 0; i < arraySize; i++){
            if(arr[i] % 2 == 0){
                for(int j = i+1; j < arraySize; j++){
                    if(arr[j] % 2 == 0 && ((j - i) % 2 == 1)){
                        ans++;
                        System.out.println("i and j : " + i + " --- " + j);
                    }
                }
            }
        }
        if(ans > 1){
            System.out.println("YES");
        }
    }
}
