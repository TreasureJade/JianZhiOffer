package dynamic_plan;

import java.util.Set;

/**
 * 分割字符串
 * <p>
 * F(i)  前i个字符是否根据字典中的词被成功分词
 * 状态方程：F(i) : 在 j<i中，只要能找到一个F(j)为true，并且从j+2到i之间的字符能在词典中找到，则F(i)为true
 * 初始值：F(0)为true
 * <a>
 * https://www.nowcoder.com/practice/5f3b7bf611764c8ba7868f3ed40d6b2c?tpId=46&tqId=29041&tPage=1&rp=1&ru=/ta/leetcode&qru=/ta/leetcode/question-ranking
 * </a>
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] breaks = new boolean[s.length() + 1];
        breaks[0] = true;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (breaks[j] && dict.contains(s.substring(j, i))) {
                    breaks[i] = true;
                    break;
                }
            }
        }
        return breaks[s.length()];
    }

}
