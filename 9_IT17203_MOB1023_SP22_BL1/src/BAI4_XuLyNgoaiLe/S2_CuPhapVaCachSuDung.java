/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_XuLyNgoaiLe;

/**
 *
 * @author Dungna89
 */
public class S2_CuPhapVaCachSuDung {

  /*
            ❑Mỗi khối try yêu cầu có ít nhất một khối catch
            hoặc/và duy nhất một khối finally.
            ❑Khối finally sẽ được thực hiện dù ngoại lệ có xuất
            hiện hay không.
        
            Các phương thức của lớp Exception
        STT	Phương thức và Miêu tả
        1 public String getMessage() Trả về một message cụ thể về exception đã xảy ra. Message này được khởi tạo bởi phương thức contructor của Throwable
        2 public Throwable getCause()Trả về nguyên nhân xảy ra exception biểu diễn bởi đối tượng Throwable
        3 public String toString()Trả về tên của lớp và kết hợp với kết quả từ phương thức getMessage()
        4 public void printStackTrace()In ra kết quả của phương thức toString cùng với stack trace đến System.err
        5 public StackTraceElement [] getStackTrace() Trả về một mảng chứa mỗi phần tử trên stack trace. Phần tử tại chỉ mục 0 biểu diễn phần trên cùng của Call Stack, và phần tử cuối cùng trong mảng biểu diễn phương thức tại dưới cùng của Call Stack
        6 public Throwable fillInStackTrace() Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.
   */
  public static void main(String[] args) {
    CuPhaTryCatch();
  }

  static void CuPhaTryCatch() {
//    try {
//      //Code có thể ném ra ngoại lệ
//    } catch (Exception e) {
    //Code xử lý ngoại lệ
//    }
    try {
      int zero = 0, average = 10 / zero;
      System.out.println("Average" + average);
    } catch (Exception e) {
      System.out.println(e.toString());
      System.out.println("Thông báo lỗi: " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("Kế thúc được hàm");
  }
}
