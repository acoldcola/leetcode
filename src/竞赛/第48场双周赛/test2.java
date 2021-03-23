package 竞赛.第48场双周赛;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/3/20 22:26
 * @Version 1.0
 */
public class test2 {
    class AuthenticationManager {
        private int a;
        private Map<String,Integer> map;
        public AuthenticationManager(int timeToLive) {
            a = timeToLive;
            map = new HashMap<>();
        }

        public void generate(String tokenId, int currentTime) {
            map.put(tokenId,currentTime);
        }

        public void renew(String tokenId, int currentTime) {
            if (map.containsKey(tokenId)) {
                int x = map.get(tokenId) + a;
                if (x <= currentTime) {
                    map.put(tokenId,currentTime);
                }
            }
        }

        public int countUnexpiredTokens(int currentTime) {
            int res = 0;
            for (String str : map.keySet()) {
                int x = map.get(str) + a;
                if (x >= currentTime) {
                    res++;
                }
            }
            return res;
        }
    }
}
