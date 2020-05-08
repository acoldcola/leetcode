package leetcode;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/26 16:33
 * @Version 1.0
 * 杨辉三角
 */
public class leetcode118 {
    public static void main(String[] args) {
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i <= numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i;j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                }else {
                    cur.add(pre.get(j) + pre.get(j-1));
                }
            }
            pre = cur;
            lists.add(cur);
        }
        return lists;
    }
    public int[] back(int[] a,int depth,int numRows) {
//        int[] b = new int[depth];
//        if (depth > numRows){
//            return null;
//        }
//        for (int i = 0; i < depth;i++) {
//            if (i == 0 || i == depth -1) {
//                b[i] = 1;
//            }else {
//                b[i] = a[i] + a[i-1];
//            }
//        }
//        List<Integer> list
//        list.add()
        return null;
    }
}
