package com.skorobahatko.leetcode;

import java.util.Arrays;

public class _26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int len = removeDuplicates(nums);
        System.out.println("len = " + len);
        System.out.println(Arrays.toString(nums));
    }

    /*
    * Given a sorted array nums, remove the duplicates in-place
    * such that each element appears only once and returns the new length.
    * Do not allocate extra space for another array, you must do this by
    * modifying the input array in-place with O(1) extra memory.
    * */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int length = nums.length;
        int index = 1;
        int currentNumber = nums[0];
        while (index != length) {
            int nextNumber = nums[index];
            if (currentNumber == nextNumber) {
                int lengthToCopy = length - (index + 1);
                System.arraycopy(nums, index+1, nums, index, lengthToCopy);
                length--;
            } else {
                currentNumber = nextNumber;
                index++;
            }
        }
        return length;
    }

}
