package Zoho_Interview_Problems.String.Find_Excel_column_number_from_column_title;

import java.util.*;

public class Find_Excel_column_number_from_column_title_{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String s = in.next();
            int result = 0;
            for (int i = 0; i < s.length(); i++)
            {
                result *= 26;
                result += s.charAt(i) - 'A' + 1;
            }
            System.out.println(result);
        }
    }
}
