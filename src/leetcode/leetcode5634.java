package leetcode;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2021/1/9 22:44
 * @Version 1.0
 */
public class leetcode5634 {
    public static void main(String[] args) {
        maximumGain("aabbaaxybbaabb" , 5,4);
    }
    public static  int maximumGain(String s, int x, int y) {
        String a = new String();
        String b = new String();
        if (x > y) {
            a = "ab";
            b = "ba";
        }else {
            a = "ba";
            b = "ab";
        }
        int res = 0;
        int left = 0;
        int right = -1;
        for (int i = 0; i < s.length();i++) {
            right++;
            if ( i< s.length() &&(s.charAt(i) == 'b' || s.charAt(i) == 'a')) {
                continue;
            }else {
                if (right - left >= 2) {
                    String str = s.substring(left,right);
                    int m = 0;
                    while (str.length() > 1) {
                        boolean flag = true;
                        for (int j = 0 ; j < str.length() - 1; j++) {
                            if (str.substring(j,j+2).equals(a)) {
                                m++;
                                flag = false;
                                str = str.substring(0, j)+str.substring(j + 2);
                                break;
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    int n = 0;
                    while (str.length() > 1) {
                        boolean flag = true;
                        for (int j = 0 ; j < str.length() - 1; j++) {
                            if (str.substring(j,j+2).equals(b)) {
                                n++;
                                flag = false;
                                str = str.substring(0, j)+str.substring(j + 2);
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    res +=  m * (Math.max(x,y)) + n * (Math.min(x,y));
                }
                left = i + 1;
                right = i + 1;
            }
        }
        return res;
    }
}
