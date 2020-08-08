/**
 * 左旋转字符串
 *
 * 先局部逆置，再整体逆置
 *
 */
public class JZ43 {
    public String LeftRotateString(String str, int n) {
        if (str.length() == 0 || n == 0) {
            return str;
        }
        // 去除重复移动
        n %= str.length();
        char[] list = str.toCharArray();
        // 前半部分逆置
        reverse(list, 0, n - 1);
        // 后半部分逆置
        reverse(list, n, str.length() - 1);
        // 整体逆置
        reverse(list, 0, str.length() - 1);
        return new String(list);
    }

    public void reverse(char[] list, int start, int end) {
        while (start < end) {
            char temp = list[start];
            list[start] = list[end];
            list[end] = temp;
            start++;
            end--;
        }
    }

}
