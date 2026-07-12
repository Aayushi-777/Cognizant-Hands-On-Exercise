package com.example.junitbasic;
public class StringUtility {
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();

    }
    public boolean isPalindrome(String text) {
        String rev = reverse(text);
        return text.equalsIgnoreCase(rev);

    }

}