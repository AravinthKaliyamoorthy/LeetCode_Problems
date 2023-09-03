class Solution {
    public int pivotIndex(int[] nums) {
       int totalArraySum = 0, leftArraySum = 0;
       for(int i = 0; i < nums.length; i++){
           totalArraySum += nums[i];
       }

       for(int i = 0; i < nums.length; i++){
           int temp = totalArraySum - nums[i] - leftArraySum;
           if(leftArraySum == temp){
               return i;
           }
           leftArraySum += nums[i];
        }
        return -1;
    }
}