package leetcode;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.io.FileReader;

/**
 * @Author ZhangKe
 * @Date 2020/5/10 11:10
 * @Version 1.0
 */
public class leetcode5405 {
    public static void main(String[] args) {
        countTriplets(new int[] {2,3,1,6,7});
    }
    public static int countTriplets(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                a ^= arr[j-1];
                int b = arr[j];
                for (int k = j; k < arr.length; k++) {
                    b ^= arr[k];
                    if (a == b){
                        sum++;
                    }
                    if (k == j) {
                        b = arr[j];
                    }
                }
                if(i == j-1) {
                    a = arr[i];
                }
            }
        }
        return sum;
    }
}
