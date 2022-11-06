package leetcode;

/**
 * @Author ZhangKe
 * @Date 2022/11/6 21:29
 * @Version 1.0
 */
public class leetcode1678 {
    public static String interpret(String command) {
        command = command.replaceAll("\\(al\\)","al").replaceAll("\\(\\)","o");
        return command;
    }

    public static void main(String[] args) {
        interpret("G()(al)");
    }
}
