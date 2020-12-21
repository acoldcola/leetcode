package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/12/21 16:45
 * @Version 1.0
 * 拼接最大数
 */
public class leetcode321 {
    public static void main(String[] args) {
        leetcode321 leetcode321 = new leetcode321();
        System.out.println(leetcode321.maxNumber(new int[]{1,6,5,4,7,3,9,5,3,7,8,4,1,1,4,21} ,new int[]{4,3,1,3,5,9}, 21).toString());
    }
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums2 == null || k > nums1.length + nums2.length) {
            return new int[k];
        }
        if (nums1.length + nums2.length == k) {
            return merge(nums1,nums2);
        }
        int[] max = new int[k];
        for(int i = 1; i < k; i++) {
            if (nums1.length < i || nums2.length < k-i){
                continue;
            }
            int[] cou = getMax(nums1,nums2,i,k-i);
            for (int j = 0; j < cou.length; j++) {
                if (cou[j] > max[j]) {
                    max = cou;
                    break;
                }else if(cou[j] == max[j]){
                    continue;
                }else {
                    break;
                }
            }
        }
        return max;
    }

    public int[] getMax(int[] nums1, int[] nums2, int a, int b) {
        int[] new1 = getNumber(nums1,a);
        int[] new2 = getNumber(nums2,b);
        return merge(new1,new2);
    }
    public int[] merge(int[] new1,int[] new2) {
        int[] res = new int[new1.length + new2.length];
        int x = 0;
        int y = 0;
        int i = 0;
        while (x < new1.length && y < new2.length){
            if (new1[x] >= new2[y]){
                if (new1[x] == new2[y]){
                    boolean flag = dfs(x,new1,y,new2);
                    if (flag) {
                        res[i++] = new1[x++];
                    }else {
                        res[i++] = new2[y++];
                    }
                }else {
                    res[i++] = new1[x++];
                }
            }else {
                res[i++] = new2[y++];
            }
        }
        while (x < new1.length) {
            res[i++] = new1[x++];
        }
        while (y < new2.length) {
            res[i++] = new2[y++];
        }
        return res;
    }
    public boolean dfs(int x,int[] new1,int y,int[]new2) {
        if (x == new1.length - 1) {
            return false;
        }else if (y == new2.length - 1){
            return true;
        }else {
            if (new1[x+1] > new2[y+1]) {
                return true;
            }else if (new1[x+1] < new2[y+1]){
                return false;
            }else {
               return dfs(x+1,new1,y+1,new2);
            }
        }
    }
    public int[] getNumber(int[] num, int size) {
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < num.length;i++) {
            while (!stack1.isEmpty() && stack1.peek() < num[i] && (num.length - 1 - i + stack1.size()) >= size) {
                stack1.pop();
            }
            stack1.push(num[i]);
        }
        while (stack1.size() > size) {
            stack1.pop();
        }
        int[] newNumber = new int[size];
        for(int i = stack1.size() - 1; i >= 0; i--) {
            newNumber[i] = stack1.pop();
        }
        return newNumber;
    }
}
