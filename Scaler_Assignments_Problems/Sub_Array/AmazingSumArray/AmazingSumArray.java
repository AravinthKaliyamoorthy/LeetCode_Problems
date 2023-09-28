package Scaler_Assignments_Problems.Sub_Array.AmazingSumArray;

public class AmazingSumArray {
    public static void main(String[] args) {
        String str = "ABEC";
        int ans = 0;

        // counting subarray with starts with vowels
        for(int i = 0; i < str.length(); i++){
            char check = str.charAt(i);
            if(check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U' || 
            check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' ){
                ans+= str.length() - i;
            }
        }
        System.out.println("ans: "+ans);
    }
}
