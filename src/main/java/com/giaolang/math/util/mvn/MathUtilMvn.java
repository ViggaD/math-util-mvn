/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.giaolang.math.util.mvn;


/**
 *
 * @author Zane
 */
// class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
// Cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm mà không cần lưu trữ gì hết, cái đó nên là Static
// Đồ nào mà là static thì gọi trực tiếp qua tên class
// không bao giờ gọi static qua con đường New
public class MathUtilMvn {
    
    public static final double PI = 3.14;
    // C#: public const double Pi = 3.14;
    // không cần chữ static mà vẫn là static nếu có từ khóa const
    // const C# - final Java
    
    // Hàm tính n! = 1,2,3,...,n
    //
    //
    //
    //
    
    //5! = 1.2.3.4.  5
    //5! = 5 x 4!
     public static long getFactorial (int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1; //nếu có thể kết thúc sớm. thì kết thúc ngay
        }
        //Dùng đệ quy
        return n * getFactorial(n - 1);
    }
     //Kỹ thuật kiểm thử gọi là: REGRESSION TESTING
     //                          KIỂM THỬ HỒI QUY - TEST LẠI NHỨNG THỨ ĐÃ TỪNG TEST
     //Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa 
     //sửa vì:
     //fix bug thì phải sửa code, sửa hàm
     //thêm hàm, thêm tính năng
     //tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
     //HÀM ĐANG NGON - MÀU XANH, NẾU TA SỬA HÀM VÌ LÍ DO GÌ ĐÓ
     //LIỆU RẰNG HÀM CÒN XANH HAY KO , THÌ PHẢI TEST LẠI
     //NẾU TEST = TAY, BNGWF LOG < THÌ CỰC KÌ TỐN THỜI GIAN, MẤT SỨC
     //TA CHỈ VIECCJ RUN LẠI CÁI TEST SCRIPT NÀY
     //NẾU HÀM SỬA GON, NÓ PHẢI RA MÀU XANH
     //NẾU HÀM SỬA KO NGON, BỊ MÀU ĐỎ !!
     //NHỜ TEST SCRIPT TA CERIFY LẠI 1 HÀM RẤT NHANH -> KIỂM THỬ LẠI 
     //THỨ ĐÃ TỪNG KIỂM THỬ ĐỂ ĐẢM BẢO NÓ CÒN NGON SO VỚI TRƯỚC
     //KHI SỬA ĐC GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESING 
     //NHỜ CI, HỒI QUY LIÊN TỤC
     
     //BÀI NÀY MÌNH THỬ HỒI QUY = CAHS SỬA LẠI HÀM THEO THUẬT TOÁN
     //ĐỆ QUY - RECURSION
     
     
     
     
//    public static long getFactorial (int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
//        }
//        if (n == 0 || n == 1) {
//            return 1; //nếu có thể kết thúc sớm. thì kết thúc ngay
//        }
//        
//        //sống sót đến chố này , sure n = 2 ... 20 Vì vậy nếu ko chết dọc đường ở 2 cum if ở trên rồi,
//        //không cần else nếu trước đó xài return
//
//        long result = 1;// giai thừa khởi đầu là 1
//        // nhân dồn 2 3 4 5...n vào biến này thì thành n!
//
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//
//        }
//        return result;
//    }

}
