package com.skorobahatko.leetcode;

public class _28_ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    /*
    * Implement strStr().
    * Return the index of the first occurrence of needle in haystack,
    * or -1 if needle is not part of haystack.
    * We will return 0 when needle is an empty string.
    * Haystack and needle consist of only lower-case English characters.
    * */
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);
    }

}
