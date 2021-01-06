package leetcode;

import org.omg.CORBA.StringHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/1/6 21:21
 * @Version 1.0
 * 除法求值
 */
public class leetcode399 {
    public static void main(String[] args) {

    }
    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int index = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> list = equations.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (!map.containsKey(list.get(j))) {
                    map.put(list.get(j),index++);
                }
            }
        }
        int size = map.size();
        double[][] a = new double[size][size];
        for (int i = 0; i < equations.size(); i++) {
            String m = equations.get(i).get(0);
            String n = equations.get(i).get(1);
            a[map.get(m)][map.get(n)] = values[i];
            a[map.get(n)][map.get(m)] = 1 / values[i];
            a[map.get(m)][map.get(m)] = 1;
            a[map.get(n)][map.get(n)] = 1;
        }
        for (int k = 0; k < size; k++){
            for(int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (k == j || a[i][k] == 0 || a[k][j] == 0) {
                        continue;
                    }
                    a[i][j] = a[i][k] * a[k][j];
                }
            }
        }
        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            if (!map.containsKey(queries.get(i).get(0)) || !map.containsKey(queries.get(i).get(1))
            ||a[map.get(queries.get(i).get(0))][map.get(queries.get(i).get(1))] == 0) {
                res[i] = -1.0;
            }else {
                res[i] = a[map.get(queries.get(i).get(0))][map.get(queries.get(i).get(1))];
            }
        }
        return res;
    }
}
