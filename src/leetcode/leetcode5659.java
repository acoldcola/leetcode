package leetcode;

import sun.misc.LRUCache;

/**
 * @Author ZhangKe
 * @Date 2021/2/6 23:19
 * @Version 1.0
 */
public class leetcode5659 {
    public static void main(String[] args) {
        leetcode5659 l = new leetcode5659();
        l.minimumLength("cabaabac");
    }

    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }else {
                left = leftLength(left,right,s) + 1;
                right = rightLength(left,right,s) - 1;
            }
        }
        return right - left + 1;
    }

    public int leftLength(int left,int right,String s) {
        while (left < right - 1) {
            if (s.charAt(left) == s.charAt(left+1)) {
                left++;
            }else {
                break;
            }
        }
        return left;
    }

    public int rightLength(int left,int right,String s) {
        while (left+1 < right) {
            if (s.charAt(right) == s.charAt(right - 1)) {
                right--;
            }else {
                break;
            }
        }
        return right;
    }
}
