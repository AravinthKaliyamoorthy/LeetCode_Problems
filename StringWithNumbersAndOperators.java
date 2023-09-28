// Input : "12345*+-+"
// Output: 6
// Explanation: [1*2+3-4+5 = 6] 

public class StringWithNumbersAndOperators{
    public static void main(String args[]){
        String str = "12345*+-+";
        int start = 1, sum = str.charAt(0) / 48 ;
        for(int i = 5; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                sum *= ((int)str.charAt((start)) % 48);
                start++;
            }
            if(str.charAt(i) == '+'){
                sum += ((int)str.charAt((start))%48);
                start++;
            }
            if(str.charAt(i) == '-'){
                sum -= ((int)str.charAt((start))%48);
                start++;
            }
        }
        System.out.println(sum);
    }
}