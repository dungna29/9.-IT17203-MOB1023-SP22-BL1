/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_Thread;

/**
 *
 * @author Dungna89
 */
public class S5_ThreadApi extends Thread {

  @Override
  public void run() {
    int i = 0;
    while (true) {
      System.out.println(i++);
      try {
        Thread.sleep(1000);
        if (i == 15) {
          break;
        }
      } catch (Exception e) {
        break;
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    S5_ThreadApi t1 = new S5_ThreadApi();
    t1.start();
    t1.join();//Join dược sử dụng để đợi một thread nào đó kết thúc
    //t2 sẽ phải đợi đến khi t1 kết thúc
    S5_ThreadApi t2 = new S5_ThreadApi();
    t2.start();

  }
}
