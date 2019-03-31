import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther ZhangKe
 * @date 2019/3/31 10:33
 */
public class leetcode1029 {
    public static void main(String[] args) {
        int[] a = {1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0};
        prefixesDivBy5(a);
    }
    public static List<Boolean> prefixesDivBy5(int[] A) {
       String a = "";
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            a = a + A[i];
            long x = Long.parseLong(a,2);
            System.out.println(x);
            if(x / 5 == 0){
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }
}
