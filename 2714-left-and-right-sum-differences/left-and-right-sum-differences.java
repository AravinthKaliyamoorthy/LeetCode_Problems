class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        int size = nums.length-1;
        for(int i = 1; i <= size; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }   
        for(int i = size-1; i >= 0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }  
        for(int i = 0; i <= size; i++){
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}