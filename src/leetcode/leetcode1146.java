package leetcode;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/6/30 18:19
 * @Version 1.0
 * 快照数组
 */
public class leetcode1146 {
    List<int[]> list = new ArrayList<>();
    int[] a;
    public leetcode1146(int length) {
        a = new int[length];
    }

    public void set(int index, int val) {
        a[index] = val;
    }

    public int snap() {
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);
        list.add(b);
        return list.size() - 1;
    }

    public int get(int index, int snap_id) {
        int[] b = list.get(snap_id);
        return b[index];
    }
}
