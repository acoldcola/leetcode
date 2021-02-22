package 竞赛.第46场双周赛;

/**
 * @Author ZhangKe
 * @Date 2021/2/20 22:21
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        canChoose(new int[][]{{6636698,4693069,-2178984,-2253405,-2732131,8550889,-2324014,-2561263},
                {-8973571,-9146179,7704305,-1063430,-6569826}},new int[]{8550889,-2178984,6636698,4693069,-2178984,-2253405,-2732131,8550889,-2324014,-2561263,-2324014,8550889,-8973571,-9146179,7704305,-1063430,-6569826,2791091,-9691134,651171,9835817,4163881,4944714,8166788,-9025553,-9250995,1599781});
    }
    public static boolean canChoose(int[][] groups, int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int x = i;
            boolean flag = true;
            for (int j = 0; j < groups.length; j++) {
                int[] a = groups[j];
                int i1 = 0;
                while (i1 < a.length) {
                    if (x == nums.length ) {
                        flag = false;
                        break;
                    }
                    if (a[i1] != nums[x]) {
                        x++;
                        i1 = 0;
                    }else {
                        x++;
                        i1++;
                    }
                }
                if (!flag) {
                    break;
                }
                if (flag && j == groups.length - 1) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

}
