package com.fu.mathutil;

// ta viết cái class để cung cấp tiện ích cho nơi khác xài
// mà khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta ko cần nhớ cái gì 
// cho riêng ta, hàm static giúp làm điều này
public class MathUtilLive {
    
    // n! = 1.2.3.4...n
    // 0! = 1! = 1
    // ko tính giai thừa cho số âm
    // 20!  là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    // nếu đưa vào âm hay là 21!, ta ko tính và ta báo k tính đc
    // một cái ngoại lệ, báo k tính được
    public static long getFactorial(int n) {
        if (n<0 || n>20) 
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
            // hàm dừng liền ko cần return
        
        if (n == 0 || n == 1) 
            return 1; // dừng ngay khi n đặc biệt
        
        // đến đây n = 2 ... 20
        // chơi for hoặc đệ quy - recursion
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
        
    }

}
