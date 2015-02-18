package org.jedynakd.palindrome;

import java.util.ArrayList;
import java.util.List;


public class PalindromeSearcher {
    private List<Integer> palindromes = new ArrayList<>();
    private BiggestPalindromeCreator biggestPalindromeCreator;

    PalindromeSearcher(BiggestPalindromeCreator biggestPalindromeCreator) {
        this.biggestPalindromeCreator = biggestPalindromeCreator;
    }

    public int findBiggestPalindromeMadeFromMultiplicationOfNumbers() {
        int checker = 0;
        int biggestPalindrome = 0;
        int maxNumber = biggestPalindromeCreator.createBiggestNumber();
        findAllPalindromes();
        while (maxNumber != createLowestDivisor()) {
            for (Integer palindrome : palindromes) {
                if (palindrome % maxNumber == 0 && checker == 0) {
                    checker++;
                    biggestPalindrome = palindrome;
                }
            }
            maxNumber--;
        }
        return biggestPalindrome;
    }

    private void findAllPalindromes() {
        String strNumber;
        int biggestPossiblePalindrome = biggestPalindromeCreator.createBiggestPossiblePalindrome();
        while (biggestPossiblePalindrome != createLowestDivisor()) {
            strNumber = Integer.toString(biggestPossiblePalindrome);
            if (strNumber.equals(new StringBuffer(strNumber).reverse().toString())) {
                palindromes.add(Integer.parseInt(strNumber));
            }
            biggestPossiblePalindrome--;
        }
    }

    private int createLowestDivisor() {
        return (biggestPalindromeCreator.createBiggestNumber() + 1) / 10;
    }
}

