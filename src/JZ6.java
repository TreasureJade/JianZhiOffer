/**
 * 题目描述：旋转数组中的最小数字
 */
public class JZ6 {
    public int minNumberInRotateArray(int[] array) {if (array == null || array.length == 0) {
        return 0;
    }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while (array[left] >= array[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = left + ((right - left) >> 1);
            // 开始二分
            if (array[left] == array[right] && array[mid] == array[left]) {
                //中间值等于左等于右 转换为线性查找
                int result = array[left];
                for (int i = left + 1; i < right; i++) {
                    if (array[i] < result) {
                        result = array[i];
                    }
                }
                return result;
            }
            // 如果中间值比左边大，则说明要找的最小值在右半部分
            if (array[mid] >= array[left]) {
                left = mid;
            }else {
                right = mid;
            }
        }
        // 循环完成之后mid值就是最小值
        return array[mid];
    }


}
