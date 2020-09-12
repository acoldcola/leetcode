package 模板;

/**
 * @Author ZhangKe
 * @Date 2020/9/12 15:02
 * @Version 1.0
 */
public class text1 {
    public static void main(String[] args) {
        text1 t = new text1();
        t.calculate("AB");
    }
    public int calculate(String s) {
        if (s == null){
            return 0;
        }
        int x = 1;
        int y = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                x = 2 * x + y;
            }else {
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}
