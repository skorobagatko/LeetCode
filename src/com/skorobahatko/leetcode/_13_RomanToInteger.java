package com.skorobahatko.leetcode;

import java.util.Arrays;
import java.util.Map;

public class _13_RomanToInteger {

    private static final Map<String, Integer> romanToIntegerMap = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000);

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    /*
    * Given a roman numeral, convert it to an integer.
    * */
    public static int romanToInt(String s) {
        int result = 0;
        String[] romanNumerals = s.split("");
        for (int i = 0; i < romanNumerals.length; i++) {
            if (i != romanNumerals.length - 1) {
                String currentSymbol = romanNumerals[i];
                String nextSymbol = romanNumerals[i+1];
                if (currentSymbol.equals("I") && nextSymbol.equals("V")) {
                    result += 4;
                    i++;
                } else if (currentSymbol.equals("I") && nextSymbol.equals("X")) {
                    result += 9;
                    i++;
                } else if (currentSymbol.equals("X") && nextSymbol.equals("L")) {
                    result += 40;
                    i++;
                } else if (currentSymbol.equals("X") && nextSymbol.equals("C")) {
                    result += 90;
                    i++;
                } else if (currentSymbol.equals("C") && nextSymbol.equals("D")) {
                    result += 400;
                    i++;
                } else if (currentSymbol.equals("C") && nextSymbol.equals("M")) {
                    result += 900;
                    i++;
                } else {
                    result += romanToIntegerMap.get(romanNumerals[i]);
                }
            } else {
                result += romanToIntegerMap.get(romanNumerals[i]);
            }
        }
        return result;
    }

}
