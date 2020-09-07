package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/9/6 11:03
 * @Version 1.0
 */
public class leetcode5508 {
    public static void main(String[] args) {
        leetcode5508 l = new leetcode5508();
        l.numTriplets(new int[]{43024,99908},new int[]{1864});
    }
    public int numTriplets(int[] nums1, int[] nums2) {
        Map<Long,Long> a = new HashMap<>();
        Map<Long,Long> b = new HashMap<>();
        for (int i = 0; i < nums1.length; i++){
            a.put((long)nums1[i]*nums1[i],a.getOrDefault((long)nums1[i]*nums1[i],0L)+1);
            int p = i;
            while (p < nums1.length - 1){
                b.put((long)nums1[i]*nums1[p + 1],b.getOrDefault((long)nums1[i]*nums1[p + 1],0L)+1);
                p++;
            }
        }
        Map<Long,Long> x = new HashMap<>();
        Map<Long,Long> y = new HashMap<>();
        for (int i = 0; i < nums2.length; i++){
            x.put((long)nums2[i]*nums2[i],x.getOrDefault((long)nums2[i]*nums2[i],0L)+1);
            int p = i;
            while (p < nums2.length - 1){
                y.put((long)nums2[i]*nums2[p+1],y.getOrDefault((long)nums2[i]*nums2[p + 1],0L)+1);
                p++;
            }
        }
        int sum = 0;
        for (Long o : a.keySet()){
            if (y.containsKey(o)){
                sum += a.get(o) * y.get(o);
            }
        }
        for (Long o1 : x.keySet()){
            if (b.containsKey(o1)){
                sum += x.get(o1) * b.get(o1);
            }
        }
        return sum;
    }
}
