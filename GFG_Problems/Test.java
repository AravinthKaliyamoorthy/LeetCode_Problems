public class Test{
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3};
        int arraySize = arr.length;
        printRepeatingElements(arr, arraySize);
    }

    public static void printRepeatingElements(int arr[], int arraySize){
        for(int i = 0; i < arraySize; i++){
            int index = arr[i] % arraySize;
            arr[index] += arraySize;
        }
        for(int i = 0; i < arraySize; i++){
            if((arr[i] / arraySize) >= 2){
                System.out.println(i);
            }
        }
    }
}