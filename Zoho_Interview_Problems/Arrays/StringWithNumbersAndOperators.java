package Zoho_Interview_Problems.Arrays.StringWithNumbersAndOperators;

// Input : "12345*+-+"
// Output: 6
// Explanation: [1*2+3-4+5 = 6] 

public class StringWithNumbersAndOperators{
    public static void main(String args[]){
        String str = "12345*+-+";
        int start = 1, sum = str.chatAt(0);
        for(int i = 0; i < str.length; i++){
            if(str.chatAt(i) == '*'){
                sum += str.chatAt(sum) * str.chatAt(start++);
            }
            if(str.chatAt(i) == '*'){
                sum += str.chatAt(start) * str.chatAt(start++);
            }
            if(str.chatAt(i) == '*'){
                sum += str.chatAt(start) * str.chatAt(start++);
            }
            if(str.chatAt(i) == '*'){
                sum += str.chatAt(start) * str.chatAt(start++);
            }
        }
    }
}