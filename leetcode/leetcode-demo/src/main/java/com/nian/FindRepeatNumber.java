package com.nian;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 找出数组中重复的数字。
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *  
 * 限制：
 * 2 <= n <= 100000
 *
 */


public class FindRepeatNumber {

    // public static int findRepeatNumber(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int flag = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (map.containsKey(nums[i])) {
    //             // Integer index = map.get(nums[i]);
    //             // map.put(nums[i],++index);
    //             flag = nums[i];
    //             break;
    //         } else {
    //             map.put(nums[i],1);
    //         }
    //     }
    //     return flag;
    // }

    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean flag = set.add(nums[i]);
            if (!flag) {
                index = nums[i];
                break;
            }
        }
        return index;
    }
}
