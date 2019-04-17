package com.zhu;

import com.zhu.solution.Solution;
import org.junit.Test;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/4/16 14:02
 */
public class SolutionTest {

    @Test
    public void Solution() {
        int[] nums = {3, 2, 4};
        int target = 6;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        System.out.println();
    }
}
