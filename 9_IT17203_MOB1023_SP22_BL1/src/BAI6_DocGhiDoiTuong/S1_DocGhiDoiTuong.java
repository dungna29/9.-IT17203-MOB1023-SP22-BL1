/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_DocGhiDoiTuong;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dungna89
 */
public class S1_DocGhiDoiTuong {
  public static void main(String[] args) {
    try {
      ghiFile();
    } catch (IOException iOException) {
    }
  }
  
  static void ghiFile() throws IOException{
    //Check file tồn tại nếu không có sẽ tiền hành tạo file
    File file = new File("dataObject.txt");
    if (!file.exists()) {//Kiểm tra sự tồn tại của file
      file.createNewFile();//Tạo mới file
    }
     List<Student> _lstStudents = new ArrayList<Student>();
    _lstStudents.add(new Student("DungnaPh01", "C#", 1, "Nguyễn Anh Dũng", "0123456", 0));
    _lstStudents.add(new Student("HoangnaPh02", "C#", 2, "Nguyễn Anh Hoàng", "0123456", 1));
    _lstStudents.add(new Student("DungnaPh03", "Java", 3, "Nguyễn Anh Dũng", "0123456", 1));
    
     FileOutputStream fos = new FileOutputStream(file);
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     for (Student x : _lstStudents) {
      oos.writeObject(x);
    }
     oos.close();
     fos.close();
  }
  static void docFile(){
    
  }
  
}
