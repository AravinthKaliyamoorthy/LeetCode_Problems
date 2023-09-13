public class PalindromeString{
    public static void main(String[] args) {
        String str = "abba";
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                continue;
            }
            else{
                System.out.println("Not palindrome string");
            }
        }
        System.out.println("Palindrome string...");
    }
}