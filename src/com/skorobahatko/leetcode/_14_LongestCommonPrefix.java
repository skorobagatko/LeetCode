package com.skorobahatko.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class _14_LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        for (int i = 0; i < strs[0].length(); i++) {
            char currentSymbol = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) return sb.toString();
                if (strs[j].charAt(i) != currentSymbol) return sb.toString();
            }
            sb.append(currentSymbol);
        }
        return  sb.toString();
    }

}
