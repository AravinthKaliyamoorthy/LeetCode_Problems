class Solution {
    public int[] replaceElements(int[] arr) {
        int maxElement = -1, arrSize = arr.length - 1, lastElement = -1, temp = 0;
        if(arrSize == 0){
            arr[arrSize] = -1;
        }
        if(arrSize >= 1){
            maxElement = arr[arrSize];
            arr[arrSize] = lastElement;
            temp = arr[arrSize - 1];
            arr[arrSize - 1] = maxElement;
            maxElement = maxElement > temp ? maxElement : temp;
        }
        for(int i = arrSize-2; i >= 0; i--){
            temp = arr[i];
            arr[i] = maxElement;
            if(maxElement < temp){
                maxElement = temp;
            }
        }
        return arr;
    }
}