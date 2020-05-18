package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/5/17 10:44
 * @Version 1.0
 */
public class leetcode5414 {
    public static void main(String[] args) {
        String[] str = new String[] {"nxaqhyoprhlhvhyojanr","ovqdyfqmlpxapbjwtssm","qmsbphxzmnvflrwyvxlc","udfuxjdxkxwqnqvgjjsp","yawoixzhsdkaaauramvg","zycidpyopumzgdpamnty"};
        String[] str1 = new String[] {"nxaqhyoprhlhvhyojanr","ovqdyfqmlpxapbjwtssm","udfuxjdxkxwqnqvgjjsp","yawoixzhsdkaaauramvg","zycidpyopumzgdpamnty"};
        String[] str2 = new String[] {"ovqdyfqmlpxapbjwtssm","qmsbphxzmnvflrwyvxlc","udfuxjdxkxwqnqvgjjsp","yawoixzhsdkaaauramvg","zycidpyopumzgdpamnty"};
        List<List<String>> lists = new ArrayList<>();
        lists.add(Arrays.asList(str));
        lists.add(Arrays.asList(str1));
        lists.add(Arrays.asList(str2));
        peopleIndexes(lists);
    }
    public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
//        List<String> strings = new ArrayList<>();
//        for (List<String> list : favoriteCompanies) {
//            StringBuilder stringBuilder = new StringBuilder();
//            Collections.sort(list);
//            for (String str : list) {
//                stringBuilder.append(str);
//                stringBuilder.append("-");
//            }
//            strings.add(stringBuilder.toString());
//        }

        List<Integer> l = new ArrayList<>();
        for (int a = 0; a < favoriteCompanies.size(); a++) {
            boolean juge = false;
            List<String> list_a = favoriteCompanies.get(a);
            for (int b = 0; b < favoriteCompanies.size(); b++) {
                if (a != b) {
                    List<String> list_b = favoriteCompanies.get(b);
                    HashMap<String,Integer> map = new HashMap<>();
                    for (int j = 0; j < list_b.size(); j++) {
                        map.put(list_b.get(j),1);
                    }
                    for (int i = 0; i < list_a.size(); i++) {
                        juge = false;
                        if (map.containsKey(list_a.get(i))) {
                            juge = true;
                        }
                        if (!juge) {
                            break;
                        }
                    }
                    if (juge) {
                        break;
                    }
                }
            }
            if (!juge) {
                l.add(a);
            }
        }
        return l;
    }
}
