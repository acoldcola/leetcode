import java.util.HashSet;
import java.util.Set;

/**
 * @auther ZhangKe
 * @date 2019/2/9 9:41
 */
public class leetcode929 {
    public static void main(String[] args) {
        String str[] = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(str));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String start = email.substring(0, email.indexOf("@"));
            String end = email.substring(email.indexOf("@"));
            String a = start.replace(".", "");
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '+')
                    a = a.substring(0, a.indexOf('+'));
            }
            System.out.println(a + end);
            set.add(a + end);
        }
        return set.size();
    }
}
