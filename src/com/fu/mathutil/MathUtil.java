
package com.fu.mathutil;

public class MathUtil {

    public static void main(String[] args) {
        
        long result = MathUtilLive.getFactorial(5);
        System.out.println("expected 5! = 120; actual: " + result);
        
        //MathUtilLive.getFactorial(-5); ném ngoại lệ thật rồi
        
        System.out.println("expected 6! = 720; actual: " + MathUtilLive.getFactorial(6));
        System.out.println("expected 0! = 1; actual: " + MathUtilLive.getFactorial(0));
        
        // kĩ thuật kiểm thử phầm mền: ước lượng xem giá trị trả về của hàm là gì
        // expected value: 5! = 120
        // hàm ai viết khi chạy thực tế là mấy - actual, giả sử 120
        // if expected == actual, hàm ngon trong tình huống này
    }
    
}
