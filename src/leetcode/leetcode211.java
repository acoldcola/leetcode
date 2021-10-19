package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/10/19 20:08
 * @Version 1.0
 * 添加与搜索单词 - 数据结构设计
 */
public class leetcode211 {
    public static void main(String[] args) {
        leetcode211 l = new leetcode211();
        l.addWord("bad");
        l.addWord("dad");
        l.addWord("mad");
        l.search("pad");
        l.search("bad");
        l.search(".ad");
        l.search("b..");
    }

    class Trie {
        boolean isEnd;
        Trie[] root = new Trie[26];
    }
    Trie trie;
    public leetcode211() {
        trie = new Trie();
    }

    public void addWord(String word) {
        Trie node = trie;
        for (int i = 0; i < word.length(); i++) {
            if (node.root[word.charAt(i) - 'a'] == null) {
                node.root[word.charAt(i) - 'a'] = new Trie();
            }
            node = node.root[word.charAt(i) - 'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = trie;
        return dfs(0,node,word);
    }

    public boolean dfs(int x,Trie node,String word) {
        if (word == null || "".equals(word)) {
            return true;
        }
        for (int i = x; i < word.length(); i++) {
            if (word.charAt(i) == '.') {
                boolean flag = false;
                for (int j = 0; j < 26; j++) {
                    if (node.root[j] != null) {
                         flag |= dfs(i+1,node.root[j],word);
                    }
                }
                return flag;
            }
            if (node.root[word.charAt(i) - 'a'] == null) {
                return false;
            }
            node = node.root[word.charAt(i) - 'a'];
        }
        return node.isEnd;
    }
}
