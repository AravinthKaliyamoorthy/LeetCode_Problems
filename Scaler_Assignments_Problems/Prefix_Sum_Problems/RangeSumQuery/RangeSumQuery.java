import java.util.*;
import java.io.*;

public class RangeSumQuery{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(findRangeSum(arr,l,r));
        }   
        sc.close();
    } 

    public static int findRangeSum(int[] arr, int l, int r){
        int n = arr.length;
        int sum[] = new int[n]; 
        sum[0] = arr[0];
        for(int i = 1; i < n; i++){
            sum[i] += arr[i] + sum[i-1];
        }
        if(l == 0){
            return sum[r];
        }
        else{
            return sum[r] - sum[l-1];
        }
    }
}