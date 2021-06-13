package com.skorobahatko.leetcode;

import java.util.Arrays;

public class _27_RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int newLength = removeElement(nums, 2);
        System.out.println("newLength = " + newLength);
        System.out.println(Arrays.toString(nums));
    }

    /*
    * Given an array nums and a value val,
    * remove all instances of that value in-place and return the new length.
    * Do not allocate extra space for another array,
    * you must do this by modifying the input array in-place with O(1) extra memory.
    *
    * The order of elements can be changed.
    * It doesn't matter what you leave beyond the new length.
    * */
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int newLength = nums.length;
        int index = 0;
        while (index != newLength) {
            if (nums[index] == val) {
                if (index != newLength - 1) {
                    int nextIndex = index + 1;
                    int lengthToCopy = newLength - nextIndex;
                    System.arraycopy(nums, nextIndex, nums, index, lengthToCopy);
                }
                newLength--;
            } else {
                index++;
            }
        }
        return newLength;
    }

}
