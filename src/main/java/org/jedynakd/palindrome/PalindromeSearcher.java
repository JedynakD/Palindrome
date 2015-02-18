package org.jedynakd.palindrome;

import java.util.ArrayList;
import java.util.List;


public class PalindromeSearcher {
    private BiggestPalindromeCreator biggestPalindromeCreator;

    PalindromeSearcher(BiggestPalindromeCreator biggestPalindromeCreator) {
        this.biggestPalindromeCreator = biggestPalindromeCreator;
    }

    public int findBiggestPalindromeMadeFromMultiplicationOfNumbers() {
        int checker = 0;
        int biggestPalindrome = 0;
        List<Integer> palindromes = findAllPalindromes();
        int maxNumber = biggestPalindromeCreator.createBiggestNumber();
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

    private List<Integer> findAllPalindromes() {
        String strNumber;
        List<Integer> palindromes = new ArrayList<>();
        int biggestPossiblePalindrome = biggestPalindromeCreator.createBiggestPossiblePalindrome();
        while (biggestPossiblePalindrome != createLowestDivisor()) {
            strNumber = Integer.toString(biggestPossiblePalindrome);
            if (strNumber.equals(new StringBuffer(strNumber).reverse().toString())) {
                palindromes.add(Integer.parseInt(strNumber));
            }
            biggestPossiblePalindrome--;
        }
        return palindromes;
    }

    private int createLowestDivisor() {
        return (biggestPalindromeCreator.createBiggestNumber() + 1) / 10;
    }
}

