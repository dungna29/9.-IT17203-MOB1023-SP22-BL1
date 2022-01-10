/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
//Nơi triển khai CRUD đối tượng
public class StudentService implements IStudentService {

  Scanner _sc = new Scanner(System.in);
  String _input;
  List<Student> _lstStudents;
  Student _student;

  public StudentService() {
    _lstStudents = new ArrayList<Student>();
    fakeData();
  }

  private void fakeData() {
    _lstStudents.add(new Student("DungnaPh01", "C#", 1, "Nguyễn Anh Dũng", "0123456"));
    _lstStudents.add(new Student("HoangnaPh02", "C#", 2, "Nguyễn Anh Hoàng", "0123456"));
    _lstStudents.add(new Student("DungnaPh03", "Java", 3, "Nguyễn Anh Dũng", "0123456"));
  }

  @Override
  public String add() {
    System.out.println("Mời bạn nhập sl: ");
    _input = _sc.nextLine();
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _student = new Student();
      _student.setId(_lstStudents.size() + 1);
      System.out.println("Mời bạn nhập tên: ");
      _student.setTen(_sc.nextLine());
      System.out.println("Mời bạn nhập sdt: ");
      _student.setSdt(_sc.nextLine());
      //về nhà thử msv tự sinh: Nguyễn Anh Dũng = dungnaph01
      System.out.println("Mời bạn nhập msv: ");
      _student.setMsv(_sc.nextLine());
      System.out.println("Chọn ngành: ");
      System.out.println("1. JAVA");
      System.out.println("2. C#1");
      System.out.println("Mời bạn chọn ngành: ");
      var nganh = _sc.nextLine();
      _student.setNganhHoc(nganh == "1" ? "JAVA" : "C#");
      _lstStudents.add(_student);
    }
    return "Thêm thành công";
  }

  @Override
  public String update() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String delte() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String find() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void inDs() {
    for (Student x : _lstStudents) {
      x.inRaManHinh();
    }
  }

}
