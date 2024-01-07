class Solution {
    public int[] replaceElements(int[] arr) {
         int max = -1;
        
        for (int i=arr.length-1; i>=0; i--)
        {
            arr[i] = arr[i] + max; 
            max = arr[i] - max; 
            arr[i] = arr[i] - max;
            if (max < arr[i])
                max = arr[i];
        }
        return arr;
    }
}