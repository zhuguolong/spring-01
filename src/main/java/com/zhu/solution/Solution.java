package com.zhu.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/4/16 13:54
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("int[] illegal!");
        }

        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution!");
    }
}
