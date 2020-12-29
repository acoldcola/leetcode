package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/12/27 11:11
 * @Version 1.0
 */

public class leetcode5640 {
    public static void main(String[] args) {
        maximizeXor(new int[]{760625198,15138539,61033,267654046,133000577,229497,155443,109330,13340119,8260519,981126373,441631490,498767021,171522247,503991705,11276686,176397,23247190,472734721,243117401},
                new int[][]{{383815038,1000000000},{4194304,1000000000},{633072806,981082380},{875344070,965383924},{31380566,64633365},{4194304,91884},{4194304,158853440},{10839453,224610550},{4194304,349538162},{171815678,403214196},{15355179,1000000000},{938931463,441640682},{23207682,1000000000},{4194304,1000000000},{75686235,1000000000},{86208917,259012},{905942425,1000000000},{692399970,1000000000},{22418605,1000000000},{369403291,1000000000}});
    }
    public static int[] maximizeXor(int[] nums, int[][] queries) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
            Queue<Integer> list = map.getOrDefault(queries[i][1],new LinkedList<>());
            list.add(i);
            map.put(queries[i][1],list);
        }
        Arrays.sort(nums);
        Arrays.sort(queries, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                 return o1[1]-o2[1];
            }
        });
        int[] res = new int[queries.length];
        Map<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][1];
            int max = 0;
            if (hashMap.containsKey(queries[i][0] +"-" +queries[i][1])) {
                max = hashMap.get(queries[i][0] +"-" +queries[i][1]);
                Queue<Integer> list = map.get(queries[i][1]);
                res[list.poll()] = max;
                continue;
            }
            for (int j = 0; j < nums.length; j++) {
                if (j == 0 && a < nums[j]) {
                    max = -1;
                    break;
                }
                if (nums[j] <= a){
                    max = Math.max(max,queries[i][0]^nums[j]);
                }else {
                    break;
                }
            }
            Queue<Integer> list = map.get(queries[i][1]);
            hashMap.put(queries[i][0] +"-" +queries[i][1],max);
            res[list.poll()] = max;
        }
        return res;
    }
}
