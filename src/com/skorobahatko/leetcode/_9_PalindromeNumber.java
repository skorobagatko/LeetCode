package com.skorobahatko.leetcode;

public class _9_PalindromeNumber {

    public static void main(String[] args) {
//        System.out.println(isPalindrome1(121));
        System.out.println(isPalindrome2(-121));
    }

    public static boolean isPalindrome1(int x) {
        String originalNumberString = Integer.toString(x);
        String reversedNumberString = new StringBuilder(Integer.toString(x))
                .reverse().toString();
        return originalNumberString.equals(reversedNumberString);
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int xCopy = x;
        int reversedX = 0;
        while (xCopy != 0) {
            reversedX += xCopy % 10;
            xCopy /= 10;
            if (xCopy != 0) {
                reversedX *= 10;
            }
        }
        return x == reversedX;
    }

}
