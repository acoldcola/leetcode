package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/8/4 16:37
 * @Version 1.0
 * 课程表
 */
public class leetcode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] a = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            lists.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++){
            lists.get(prerequisites[i][1]).add(prerequisites[i][0]);
            a[prerequisites[i][0]] ++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                queue.offer(i);
            }
        }
        int cou = 0;
        while (!queue.isEmpty()){
            cou++;
            int u = queue.poll();
            for (int v : lists.get(u)){
                a[v] --;
                if (a[v] == 0) {
                    queue.offer(v);
                }
            }
        }
        return cou == numCourses;
    }
}
