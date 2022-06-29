package com.nian;

import java.util.Arrays;

/**
 * 统计一个数字在排序数组中出现的次数。
 *
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 *
 * 示例 2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *
 * 提示：
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 *  
 */

public class Search {

    /*public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

            while (start <= end) {
                int mid = (end + start) / 2;
                if (target == nums[mid]) {
                    return mid;
                }
                if (target > nums[mid]){
                    start = mid + 1;
                }
                if (target < nums[mid]){
                    end = mid - 1;
                }
            }

        return -1;
    }*/

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int findFirstPosition = findFirstPosition(nums,target);
        if (findFirstPosition == -1){
            return 0;
        }
        int findLastPosition = findLastPosition(nums,target);
        return findLastPosition - findFirstPosition + 1;
    }

    private int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            // System.out.print(left + "\t");
            // System.out.print(right + "\t");
            // System.out.println(mid);
           /* if (nums[mid] < target) {
                // [mid + 1, right]
                left = mid + 1;
            } else if (nums[mid] == target) {
                // [mid, right]
                left = mid;
            }else {
                // nums[mid] > target
                // [left, mid - 1]
                right = mid - 1;
            }*/

            if (nums[mid] <= target) {
                left = mid;
            } else {
                // nums[mid] > target
                // [left, mid - 1]
                right = mid - 1;
            }
        }
        return left;
    }

    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            /*if (nums[mid] < target) {
                // [mid + 1, right]
                left = mid + 1;
            } else if (nums[mid] == target) {
                // [left, mid]
                right = mid;
            }else {
                // nums[mid] > target
                // [left, mid - 1]
                right = mid - 1;
            }*/

            if (nums[mid] < target) {
                // [mid + 1, right]
                left = mid + 1;
            } else {
                // nums[mid] >= target
                right = mid;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
