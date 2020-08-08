import java.util.Stack;

/**
 * 翻转单词序列
 */
public class JZ44 {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] list = str.toCharArray();
        int length = list.length;
        int i = 0;
        int j = 0;

        while (i < length) {
            // i往后走，直到遇到第一个空格
            while (i < length && !Character.isSpaceChar(list[i])) {
                i++;
            }
            // 逆置当前子串
            Reverse(list, j, i - 1);

            // 过滤所有空格，指向下一个子串的开始
            while (i < length && Character.isSpaceChar(list[i])) {
                i++;
            }
            j = i;

        }

        Reverse(list, j, i - 1);
        Reverse(list, 0, i - 1);


        return new String(list);

    }

    private void Reverse(char[] list, int start, int end) {
        while (start < end) {
            char temp = list[start];
            list[start] = list[end];
            list[end] = temp;
            start++;
            end--;
        }
    }

    // 用栈实现
//    public String ReverseSentence(String str) {
//        if (str == null || str.length() == 0) {
//            return str;
//        }
//        StringBuffer res = new StringBuffer();
//
//        Stack<String> stack = new Stack<>();
//        // 根据String.split方法。用“ ”将原字符串分割成一个String数组。
//        String[] list = str.split(" ");
//        if (list.length == 0) {
//            return str;
//        }
//        for (int i = 0; i < list.length - 1; i++) {
//            stack.push(list[i]);
//            stack.push(" ");
//        }
//        // 最后一个子串是翻转后的首部单词，没有必要加“ ”。
//        stack.push(list[list.length - 1]);
//        while (!stack.empty()) {
//            String tmp = stack.pop();
//            res.append(tmp);
//        }
//
//        return res.toString();
//
//    }

}