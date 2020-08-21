package leetcode;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Iterator;

/**
 * @Author ZhangKe
 * @Date 2020/8/21 17:28
 * @Version 1.0
 * 第 k 个缺失的正整数
 */
public class leetcode1539 {
    public static void main(String[] args) {
        leetcode1539 leetcode1539 = new leetcode1539();
        leetcode1539.findKthPositive(new int[]{1,2},1);
    }
    public int findKthPositive(int[] arr, int k) {
        int[] a = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]] = 1;
        }
        int cou = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                if (++cou == k) {
                    return i;
                }
            }
        }
        return 0;
    }
}
