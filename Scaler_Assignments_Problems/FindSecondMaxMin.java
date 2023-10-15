import java.util.Arrays;

public class FindSecondMaxMin {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(getSecondOrderElements(arr.length, arr)));
    }

    public static int[] getSecondOrderElements(int n, int []arr) {
        // Write your code here.
        int firstMax = arr[0], firstMin = arr[0], secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            if(firstMax < arr[i]){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(secondMax < arr[i]){
                secondMax = arr[i];
            }
            if(firstMin > arr[i]){
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if(secondMin > arr[i]){
                secondMin = arr[i];
            }
        }
        return new int[] {secondMax, secondMin};
    }

}
