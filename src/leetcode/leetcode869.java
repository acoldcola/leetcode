package leetcode;


/**
 * @Author ZhangKe
 * @Date 2020/9/9 15:42
 * @Version 1.0
 * 重新排序得到 2 的幂
 */
public class leetcode869 {
    public static void main(String[] args) {
        leetcode869 l = new leetcode869();
        l.reorderedPowerOf2(4802);
    }
    boolean res = false;
    public boolean reorderedPowerOf2(int N) {
        String str = String.valueOf(N);
        boolean[] used = new boolean[str.length()];
        dfs(str,new StringBuilder(),used);
        return res;
    }

    private void dfs(String str, StringBuilder stringBuilder, boolean[] used) {
        if (stringBuilder.length() == str.length()){
            int n = Integer.valueOf(stringBuilder.toString());
            if ((n & (n -1)) == 0){
                res = true;
            }
            return;
        }
        for (int i = 0; i < str.length(); i++){
            if (res){
                break;
            }else {
                if (used[i] || (str.charAt(i) == '0' && stringBuilder.length() == 0)){
                    continue;
                }
                stringBuilder.append(str.charAt(i));
                used[i] = true;
                dfs(str,stringBuilder,used);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                used[i] = false;
            }
        }
    }
}
