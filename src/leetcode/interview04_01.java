package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/9/1 18:03
 * @Version 1.0
 * 节点间通路
 */
public class interview04_01 {
    private boolean res = false;
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            List<Integer> list = null;
            if (map.containsKey(graph[i][0])){
                list = map.get(graph[i][0]);
            }else {
                list = new ArrayList<>();
            }
            list.add(graph[i][1]);
            map.put(graph[i][0],list);
        }
        for (Integer key : map.keySet()){
            if (key == start){
                dfs(target,false,map,start);
                if (res){
                    return res;
                }
            }
        }
        return res;
    }

    private void dfs(int target,boolean b, Map<Integer,List<Integer>> map,int i) {
        if (b) {
            res = true;
            return;
        }
        List<Integer> list = map.get(i);
        if (list == null || list.size() < 1) {
            return;
        }
        for (int j = 0; j < list.size(); j++){
            if (list.get(j) == target) {
                dfs(target,true,map,list.get(j));
            }else {
                dfs(target,false,map,list.get(j));
            }
        }
    }
}
