package waitNotify.size5;


/**
 * @author wenjianli
 * @date 2022/7/3 8:57 下午
 */
public class Test {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            MyThread1 thread1 = new MyThread1(lock);
            thread1.start();
            Thread.sleep(50);
            MyThread2 thread2 = new MyThread2(lock);
            thread2.start();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
