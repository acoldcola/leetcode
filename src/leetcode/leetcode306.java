package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/10 16:14
 * @Version 1.0
 *  累加数
 */
public class leetcode306 {
    public static void main(String[] args) {
        leetcode306 l = new leetcode306();
        l.isAdditiveNumber("120122436");
    }
    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3){
            return false;
        }
        for (int i = 1; i <= num.length() /2; i++){
            for (int j = i + 1; j < num.length();j++){
                if (dfs(0,i,j,num)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int k, String num) {
        if (num.charAt(i) == '0' && j - i > 1 || num.charAt(j) == '0' && k - j > 1){
            return false;
        }
        String sum = sub(num.substring(i,j),num.substring(j,k));
        if (sum.length() > num.length() - k || !sum.equals(num.substring(k,k + sum.length()))){
            return false;
        }
        if (sum.length() == num.length() - k) {
            return true;
        }
        return dfs(j,k,k + sum.length(),num);
    }

    public String sub(String str1, String str2){
        int x = str1.length() - 1;
        int y = str2.length() - 1;
        int cou = 0;
        StringBuilder sb = new StringBuilder();
        while (x >= 0 || y >= 0 || cou >0){
            int a = x >= 0 ? str1.charAt(x) - '0' : 0;
            int b = y >= 0 ? str2.charAt(y) - '0' : 0;
            int c = a + b + cou;
            sb.append(c % 10);
            cou = c / 10;
            x--;
            y--;
        }
        return sb.reverse().toString();
    }
}
