package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/24 10:30
 * @Version 1.0
 */
public class leetcode5416 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++)  {
            if (strings[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
