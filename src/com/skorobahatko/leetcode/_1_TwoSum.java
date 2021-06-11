package com.skorobahatko.leetcode;

import java.util.Arrays;

public class _1_TwoSum {

    public static void main(String[] args) {
        int[] result = twoSum1(new int[] {2, 7, 11, 15}, 17);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        outer:
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    break outer;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        
        return result;
    }
}
