/**
 * 替换空格
 * 替换字符串中的空格为 20%
 */
public class JZ2 {
    public String replaceSpace(StringBuffer str) {
        int count = 0;
        // 计算空格个数
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        int newSize = str.length() + 2 * count;
        int oldIndex = str.length() - 1;
        // 新的索引下标
        int newIndex = newSize - 1;
        str.setLength(newSize);
        // 从后往前遍历
        while (oldIndex >= 0 && newIndex >= 0) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex, str.charAt(oldIndex));
                newIndex--;
                oldIndex--;
            }
        }
        return str.toString();
    }
}
