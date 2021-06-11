package com.skorobahatko.leetcode;

public class _7_ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }

//    Given a signed 32-bit integer x, return x with its digits reversed.
//    If reversing x causes the value to go outside the signed 32-bit integer
//    range [-2^31, 2^31 - 1], then return 0.
//    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result += x % 10;
            x /= 10;
            if (x != 0) {
                if ((Integer.MAX_VALUE / 10) < result ||
                        (Integer.MIN_VALUE / 10) > result) {
                    return 0;
                }
                result *= 10;
            }
        }
        return result;
    }

}
