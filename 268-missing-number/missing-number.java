class Solution {
    public int missingNumber(int[] nums) {
        int arrayLength = nums.length;
        int n = arrayLength * ( arrayLength + 1 ) / 2;
        for(int i = 0; i < arrayLength; i++){
            n -= nums[i];
        }
        return n;
    }
}