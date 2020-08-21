package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/8/21 16:45
 * @Version 1.0
 * 将数组分成和相等的三个部分
 */
public class leetcode1013 {
    public static void main(String[] args) {
        leetcode1013 leetcode1013 = new leetcode1013();
        leetcode1013.canThreePartsEqualSum(new int[] {0,2,1,-6,6,7,9,-1,2,0,1});
    }
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int cout = 0;
        int judge = 0;
        for (int i = 0; i < A.length; i++){
            cout += A[i];
            if (cout == sum/3){
                cout = 0;
                judge++;
            }
        }
        return judge > 2;
    }
}
