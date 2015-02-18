package org.jedynakd.palindrome;

import java.util.Scanner;

public class Application {
    public static void main(String args[]) {
        int digit;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many digits.");
        digit = in.nextInt();
        System.out.println("Enter how many numbers.");
        number = in.nextInt();
        PalindromeSearcher palindromeSearcher = new PalindromeSearcher(new BiggestPalindromeCreator(digit, number));
        int palindrome = palindromeSearcher.findBiggestPalindromeMadeFromMultiplicationOfNumbers();
        System.out.println("Biggest palindrome is " + palindrome);
    }
}
