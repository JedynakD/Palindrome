package org.jedynakd.palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeSearcher {
    public static void main(String args[]) {
        int digit;
        int number;
        List<Integer> palindromes = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many digits.");
        digit = in.nextInt();
        System.out.println("Enter how many numbers.");
        number = in.nextInt();

        String strMaxNumber = "";
        for (int i = 0; i < digit; i++) {
            strMaxNumber = 9 + strMaxNumber;
        }
        int maxNumber = Integer.parseInt(strMaxNumber);
        int maxPossiblePalindrome = 1;
        for (int j = 0; j < number; j++) {
            maxPossiblePalindrome = maxPossiblePalindrome * maxNumber;
        }

        String strNumber;
        int lowestDivisor = (maxNumber + 1) / 10;
        while (maxPossiblePalindrome != lowestDivisor) {
            strNumber = Integer.toString(maxPossiblePalindrome);
            if (strNumber.equals(new StringBuffer(strNumber).reverse().toString())) {
                palindromes.add(Integer.parseInt(strNumber));
            }
            maxPossiblePalindrome--;
        }

        int checker = 0;
        maxNumber = Integer.parseInt(strMaxNumber);
        while (maxNumber != lowestDivisor) {
            for (Integer intPalindrome : palindromes) {
                if (intPalindrome % maxNumber == 0 && checker == 0) {
                    System.out.println("Biggest palindrome made from multiplication of " + number + " numbers each consisting " + digit + " digits is " + intPalindrome);
                    checker++;
                }
            }
            maxNumber--;
        }
    }
}
