package org.jedynakd.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeSearcherTest {
    private BiggestPalindromeCreator biggestPalindromeCreator;
    private PalindromeSearcher palindromeSearcher;

    @Test
    public void shouldReturnBiggestPalindromeMadeOfMultiplicatingTwoNumbersConsistingTwoDigits() {
        biggestPalindromeCreator = new BiggestPalindromeCreator(2,2);
        palindromeSearcher = new PalindromeSearcher(biggestPalindromeCreator);

        int actual = palindromeSearcher.findBiggestPalindromeMadeFromMultiplicationOfNumbers();

        assertEquals(9009, actual);
    }

    @Test
    public void shouldReturnBiggestPalindromeMadeOfMultiplicatingTwoNumbersConsistingThreeDigits() {
        biggestPalindromeCreator = new BiggestPalindromeCreator(3,2);
        palindromeSearcher = new PalindromeSearcher(biggestPalindromeCreator);

        int actual = palindromeSearcher.findBiggestPalindromeMadeFromMultiplicationOfNumbers();

        assertEquals(90909, actual);
    }



}