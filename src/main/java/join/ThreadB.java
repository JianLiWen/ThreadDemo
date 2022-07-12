package join;

/**
 * @author wenjianli
 * @date 2022/7/7 11:51 上午
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
       try{
           ThreadA a = new ThreadA();
           a.start();
           a.join();
           System.out.println("线程B在run end处打印了");
       } catch (InterruptedException e) {
           System.out.println("线程B在catch处打印了");
           e.printStackTrace();
       }
    }
}
