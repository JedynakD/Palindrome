package org.jedynakd.palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeSearcher {
    public static void main(String args[]) {
        int digit;
        int number;
        List<String> palindromes = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        digit = in.nextInt();
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
        while (maxPossiblePalindrome != 11) {
            strNumber = Integer.toString(maxPossiblePalindrome);
            if (strNumber.substring(0, strNumber.length() / 2).equals(new StringBuffer(strNumber.substring((strNumber.length() / 2), strNumber.length())).reverse().toString())) {
                palindromes.add(strNumber);
            }
            if (strNumber.substring(0, (strNumber.length() / 2) + 1).equals(new StringBuffer(strNumber.substring(((strNumber.length() / 2)), strNumber.length())).reverse().toString())) {
                palindromes.add(strNumber);
            }
            maxPossiblePalindrome--;
        }
        int checker = 0;
        maxNumber = Integer.parseInt(strMaxNumber);

        while (maxNumber != 1) {
            for (String palindrome : palindromes) {
                int intPalindrome = Integer.parseInt(palindrome);
                if (intPalindrome % maxNumber == 0 && checker == 0) {
                    System.out.println(palindrome);
                    checker++;
                }
            }
            maxNumber--;
        }
    }
}
