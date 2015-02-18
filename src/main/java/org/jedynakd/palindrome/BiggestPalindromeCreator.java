package org.jedynakd.palindrome;


public class BiggestPalindromeCreator {
    private int biggestPossiblePalindrome = 1;
    private int digit;
    private int number;

    public BiggestPalindromeCreator(int digit, int number) {
        this.digit = digit;
        this.number = number;
    }

    public int createBiggestPossiblePalindrome() {
        int biggestNumberToCreatePalindrome = createBiggestNumber();
        for (int j = 0; j < number; j++) {
            biggestPossiblePalindrome = biggestPossiblePalindrome * biggestNumberToCreatePalindrome;
        }
        return biggestPossiblePalindrome;
    }

    public int createBiggestNumber() {
        String strBiggestToCreatePalindromeNumber = "";
        for (int i = 0; i < digit; i++) {
            strBiggestToCreatePalindromeNumber = "9" + strBiggestToCreatePalindromeNumber;
        }
        return Integer.parseInt(strBiggestToCreatePalindromeNumber);
    }
}
