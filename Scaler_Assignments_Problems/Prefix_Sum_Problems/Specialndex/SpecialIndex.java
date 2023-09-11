package Scaler_Assignments_Problems.Prefix_Sum_Problems.Specialndex;

import java.util.Scanner;

public class SpecialIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSpecialIndexB(arr, n));
        sc.close();
    }

    public static int findSpecialIndexB(int arr[], int size){
        int count = 0;
        boolean flag = true;
        for(int i = 0; i < size; i++){
            int oddSum = 0, evenSum = 0;
            for(int j = 0; j < size; j++){
                if(i != j){
                    if(flag){
                        evenSum += arr[j];
                        flag = false;
                    }
                    else{
                        oddSum += arr[j];
                        flag = true;
                    }
                }
            }
            System.out.println("odd : " + oddSum +" Even: " + evenSum);
            if(oddSum == evenSum){
                count++;
            }
        }
        return count;
    }

     

}