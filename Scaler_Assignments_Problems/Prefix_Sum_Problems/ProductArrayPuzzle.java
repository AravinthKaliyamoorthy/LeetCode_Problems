import java.util.*;
import java.io.*;
import java.util.Scanner;

class ProductArrayPuzzle{
    //write main function   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        productArray(arr);
    }
    public static void productArray(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i=1;i<n;i++){
            left[i] = arr[i-1]*left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i] = arr[i+1]*right[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i] = left[i]*right[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}