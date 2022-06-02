package threadTest;

import MyThread.MyThread;

/**
 * @author wenjianli
 * @date 2022/4/12 8:11 下午
 */
public class MyThreadTest {

    public static void main(String[] args) {
        try{
            MyThread  myThread = new MyThread();
            myThread.setName("MyThread");
            myThread.start();
            for (int i=0;i<10;i++){
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" +  Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
