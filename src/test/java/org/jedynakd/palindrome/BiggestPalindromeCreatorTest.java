package org.jedynakd.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiggestPalindromeCreatorTest {
    private BiggestPalindromeCreator biggestPalindromeCreator;

    @Test
    public void shouldReturnBiggestNumberMadeOfOneDigit() {
        biggestPalindromeCreator = new BiggestPalindromeCreator(1, 5);
        int actual = biggestPalindromeCreator.createBiggestNumber();

        assertEquals(9, actual);
    }

    @Test
    public void shouldReturnBiggestNumberMadeOfThreeDigits() {
        biggestPalindromeCreator = new BiggestPalindromeCreator(3, 5);
        int actual = biggestPalindromeCreator.createBiggestNumber();

        assertEquals(999, actual);
    }

    @Test
    public void shouldReturnResultOfMultiplicationOfTwoBiggestNumbersMadeOfOneBiggestDigit() {
        biggestPalindromeCreator = new BiggestPalindromeCreator(1, 2);
        int actual = biggestPalindromeCreator.createBiggestPossiblePalindrome();

        assertEquals(81, actual);
    }

    @Test
    public void shouldReturnResultOfMultiplicationOfTwoBiggestNumbersMadeOfThreeBiggestDigits() {
        biggestPalindromeCreator = new BiggestPalindromeCreator(3, 2);
        int actual = biggestPalindromeCreator.createBiggestPossiblePalindrome();

        assertEquals(998001, actual);
    }



}