package Scaler_Assignments_Problems.Prefix_Sum.ProductArrayPuzzle;

import java.util.*;

class ProductArrayPuzzle{
    //write main function   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        
        }
        //create object class and access productExceptSelf method   
        ProductArrayPuzzle obj = new ProductArrayPuzzle();
        // BruteForce Approach
        // System.out.println(Arrays.toString(obj.productExceptSelfB(arr)));
        // System.out.println(Arrays.toString(obj.productExceptSelfO(arr)));
        System.out.println(Arrays.toString(obj.productExceptSelfO1(arr)));
        sc.close();
    }
    public int[] productExceptSelfB(int[] nums) {
        int result[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int temp = 1;
            for(int j = 0; j < nums.length; j++){
                if( i != j ){
                    temp *= nums[j];
                }
            }
            result[i] = temp;
        }
        return result;
    }

    public int[] productExceptSelfO(int[] nums){
        int prefix[] = new int[nums.length];
        int n = nums.length;
        prefix[0] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        int rightSum = 1, temp = 1;
        for(int i = n-1; i >= 0; i--){
            rightSum = nums[i];
            nums[i] = prefix[i] * temp;
            temp *= rightSum;
        }
        return nums;
    
    }

    public int[] productExceptSelfO1(int[] nums){
        int n = nums.length;
        int leftProduct[] = new int[n];
        int rightProduct[] = new int[n];
        leftProduct[0] = 1;
        rightProduct[n-1] = 1;
        for(int i = 1; i < n; i++){
            leftProduct[i] = nums[i-1] * leftProduct[i-1]; 
        }
        for(int i =  n-2; i >= 0; i--){
            rightProduct[i] = nums[i+1] * rightProduct[i+1];
        }
        for(int i = 0; i < n; i++){
            nums[i] = leftProduct[i] * rightProduct[i];
        }
        return nums;    
    }
}