package 第86场双周赛;

/**
 * @Author ZhangKe
 * @Date 2022/9/3 22:29
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        test2 test = new test2();
        test.isStrictlyPalindromic(4);
    }

    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n-2;i++) {
            int res = ConversionN(n, i);
            String result = String.valueOf(res);
            StringBuilder str = new StringBuilder();
            str = str.append(result);
            StringBuilder a = new StringBuilder();
            a = a.append(result);
            StringBuilder b = str.reverse();
            if (!a.equals(b)) {
                return false;
            }
        }
        return true;
    }
    public  int ConversionN(int temp,int n){
        int l=0,j=1;
        while(n<=10 && temp!=0){
            l+=(temp%n)*j;
            temp=temp/n;
            j=j*10;
        }
        return l;
    }
}
