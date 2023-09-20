package FindSmallestMinMax;

public class FindSmallestMinMax{
    
    public static void main(String args[]){
        int arr[] = {2, 1, 4, 6 , 5, 2, 6, 3, 4, 6, 5, 3, 2, 1, 1};
        // int arr[] = {8, 9};        
        int minE = Integer.MAX_VALUE, maxE = Integer.MIN_VALUE, minId = -1, maxId = -1;
        int arraySize = arr.length, length = arraySize;

        // finding minimum and maximum element in the array
        for(int i = 0; i < arraySize; i++){
            if(minE > arr[i]){  
                minE = arr[i];
            }
            if(maxE < arr[i]){
                maxE = arr[i];
            }
        }

        //finding smallest subarray which contains both min and max element --> brute force approach
        //TC: O(N^2) SC: O(1)
        boolean minB = false, maxB = false;
        for(int i = 0; i < arraySize; i++){
            if(arr[i] == minE){
                minB = true;
            }
            else if(arr[i] == maxE){
                maxB = true;
            }
            if(minB || maxB){
                for(int j = i+1; j < arraySize; j++){
                    if(!minB && arr[j] == minE){
                        length = Math.min(length, j - i + 1);
                    }
                    else if(!maxB && arr[j] == maxE){
                        length = Math.min(length, j - i + 1);
                    }
                }
                minB = maxB = false;
            }
            
        }
        System.out.println("Smallest subarray length is : "+length);

        minE = Integer.MAX_VALUE; maxE = Integer.MIN_VALUE; minId = -1; maxId = -1;
        arraySize = arr.length; length = arraySize;
        //finding smallest subarray which contains both min and max element --> optimized approach
        //TC: O(N) SC: O(1)
        for(int i = 0; i < arraySize; i++){
            if(arr[i] ==  minE){
                minId = i;
                if(maxId != -1){
                    length = Math.min(length, minId - maxId + 1);
                }
            }
            if(arr[i] ==  maxE){
                maxId = i;
                if(minId != -1){
                    length = Math.min(length, maxId - minId + 1);
                }
            }
        }
        System.out.println("Smallest subarray length is : "+length);
    }
}