package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/12/11 17:28
 * @Version 1.0
 * Dota2 参议院
 */
public class leetcode649 {
    public static void main(String[] args) {
        leetcode649 l = new leetcode649();
        l.predictPartyVictory("RD");
    }
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if ('R' == senate.charAt(i)) {
                radiant.offer(i);
            }else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int i = radiant.poll();
            int j = dire.poll();
            if (i < j) {
                radiant.offer(i+n);
            }else {
                dire.offer(j + n);
            }
        }
        return !radiant.isEmpty() ? "Radiant" : "Dire";
    }
}
