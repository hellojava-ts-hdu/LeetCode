package com.itsheng.leetcode.sort;

import java.util.Arrays;

/**
 * @Author tiansheng38065
 * @Description 常用排序算法
 * @Date 17:40 2022/7/10
 * @Param
 * @return
**/
public class ManySortMethods {
    public static void main(String[] args) {
        int[] ans = {1,3,2,4,8,7,4};
//        int[] ints = selectSorts(ans);
        int[] ints = bulloSort(ans);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] insertSort(int[] arr) {
        if (null == arr || arr.length < 2) return arr;

        return arr;
    }
    /**
     * @Author tiansheng38065
     * @Description 冒泡排序
     * @Date 18:01 2022/7/10
     * @Param [arr]
     * @return int[]
    **/
    public static int[] bulloSort(int[] arr) {
        if (null == arr || arr.length < 2) return arr;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swaps(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    /**
     * @Author tiansheng38065
     * @Description 选择排序
     * @Date 17:42 2022/7/10
     * @Param [arr]
     * @return int[]
    **/
    public static int[] selectSorts(int[] arr) {
        if (null == arr || arr.length < 2) return arr;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            if (i != minIndex) {
                swaps(arr,i,minIndex);
            }
        }
        return arr;
    }
    /**
     * @Author tiansheng38065
     * @Description 传统方法交换两个数的位置
     * @Date 17:56 2022/7/10
     * @Param [arr, i, j]
     * @return void
    **/
    public static void swaps1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * @Author tiansheng38065
     * @Description 位运算交换两个数
     * @Date 17:57 2022/7/10
     * @Param [arr, i, j]
     * @return void
    **/
    public static void swaps(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
