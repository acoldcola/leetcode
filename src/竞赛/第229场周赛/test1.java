package 竞赛.第229场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/2/21 10:25
 * @Version 1.0
 */
public class test1 {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        for (; i < word1.length(); i++) {
            sb.append(word1.charAt(i));
        }
        for (; j < word2.length(); j++) {
            sb.append(word2.charAt(j));
        }
        return sb.toString();
    }
}
