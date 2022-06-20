package threadTest;

import MyThread.MyOneThread1;
import MyThread.MyOneThread2;
import common.MyOneList;
import common.MyOneService;

/**
 * @author wenjianli
 * @date 2022/6/20 9:34 下午
 */
public class MyOneThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyOneThread1 thread1 = new MyOneThread1(list);
        thread1.setName("A");
        thread1.start();
        MyOneThread2 thread2 = new MyOneThread2(list);
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("listSize=" + list.getSize());
    }
}
