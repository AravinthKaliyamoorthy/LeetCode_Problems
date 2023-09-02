class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int size = nums.length-1;
        for(int i = 1; i <= size; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }   
        int rightSum = 0;
        for(int i = size-1; i >= 0; i--){
            rightSum += nums[i+1];
            leftSum[i] = Math.abs(rightSum - leftSum[i]);
        }  
        return leftSum;
    }
}