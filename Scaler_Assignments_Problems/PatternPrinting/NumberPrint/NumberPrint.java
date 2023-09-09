package Scaler_Assignments_Problems.PatternPrinting.NumberPrint;

import java.util.*;

public class NumberPrint{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input : ");
        int size = in.nextInt();
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                System.out.print("0");
            }
            for(int k = size-i-1; k < size; k++){
                System.out.print(size-k);
            }
            System.out.println();
        }
        System.out.println("----------------");
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            for(int k = i+1; k < size; k++){
                System.out.print("0");
            }
            System.out.println();
        }
        in.close();
    }    
}
