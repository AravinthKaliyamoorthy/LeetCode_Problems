package Zoho_Interview_Problems.Arrays.StringWithNumbersAndOperators;

// Input : "12345*+-+"
// Output: 6
// Explanation: [1*2+3-4+5 = 6] 

public class StringWithNumbersAndOperators{
    public static void main(String args[]){
        String str = "12345*+-+";
        int start = 1, sum = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                sum += str.charAt(sum) * str.charAt(start++);
            }
            if(str.charAt(i) == '*'){
                sum += str.charAt(start) * str.charAt(start++);
            }
            if(str.charAt(i) == '*'){
                sum += str.charAt(start) * str.charAt(start++);
            }
            if(str.charAt(i) == '*'){
                sum += str.charAt(start) * str.charAt(start++);
            }
        }
    }
}