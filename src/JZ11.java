public class JZ11 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            // n与n-1相& 通过0借位1 消除原始数据中的1 相&多少次就有多少个1
            // 最后的相&结果就是0
            n&=(n-1);
        }
        return count;
    }
}
