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
public class S6_Synchronized_DongBoHoa implements Runnable{

  @Override
  public synchronized void run() {
   int i = 0;
    while (true) {
      try {
        System.out.println(i++);
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        break;
      }
    }
  }
  public static void main(String[] args) {
    //Hôm Sau làm ví dụ nốt về thằng này đang chưa đủ vì 2 luồng t1 và t2 đang chạy độc lập cần gộp luồng lại với nhau
    Thread t1 = new Thread(new S6_Synchronized_DongBoHoa());
    t1.start();
    Thread t2 = new Thread(new S6_Synchronized_DongBoHoa());
    t2.start();
  }
  
}
