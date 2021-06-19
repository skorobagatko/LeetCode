package com.skorobahatko.leetcode;

public class _35_SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    /*
    * Given a sorted array of distinct integers and a target value,
    * return the index if the target is found.
    * If not, return the index where it would be if it were inserted in order.
    * You must write an algorithm with O(log n) runtime complexity.
    * */
    public static int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            int currentIndex = (startIndex + endIndex) / 2;
            int currentValue = nums[currentIndex];
            if (currentValue == target) {
                return currentIndex;
            } else if (currentValue > target) {
                if (startIndex == endIndex) {
                    return currentIndex;
                }
                endIndex = currentIndex - 1;
            } else {
                if (startIndex == endIndex) {
                    return currentIndex + 1;
                }
                startIndex = currentIndex + 1;
            }

            if (startIndex > endIndex && currentValue > target) {
                return currentIndex;
            } else if (startIndex > endIndex) {
                return currentIndex + 1;
            }
        }
        return -1;
    }

}
