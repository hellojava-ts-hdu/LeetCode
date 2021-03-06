package com.itsheng.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author tiansheng
 * @Description //TODO
 * @Date 13:13 2022/7/10
 * @Param
 * @return
**/
public class twoSumn {

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * 你可以按任意顺序返回答案。
    **/
    public static void main(String[] args) {
        int[] ans = {2,7,11,15};
        int target = 9;
        int[] ints = twoSum(ans, target);
        System.out.println(Arrays.toString(ints));
        int[] int1s = twoSum1(ans, target);
        System.out.println(Arrays.toString(int1s));

    }
    /**
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     * @Date 13:14 2022/7/10
     * @Param [nums, target]
     * @return int[]
    **/
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        if (null == nums || nums.length == 0) {
            return new int[0];
        }
        // 创建一个map key：出现的数字，value 出现的位置
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    // 暴力破解
    public static int[] twoSum1(int[] nums, int target) {
        int[] ans = new int[2];
        if (null == nums || nums.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
