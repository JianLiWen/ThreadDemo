package threadTest;

import MyThread.MyThread1;

/**
 * @author wenjianli
 * @date 2022/4/12 8:11 下午
 */
public class MyThread1Test {

    // 线程运行的顺序和start写的顺序无关，具有随机性
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1(1);
        MyThread1 thread2 = new MyThread1(2);
        MyThread1 thread3 = new MyThread1(3);
        MyThread1 thread4 = new MyThread1(4);
        MyThread1 thread5 = new MyThread1(5);
        MyThread1 thread6 = new MyThread1(6);
        MyThread1 thread7 = new MyThread1(7);
        MyThread1 thread8 = new MyThread1(8);
        MyThread1 thread9 = new MyThread1(9);
        MyThread1 thread10 = new MyThread1(10);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

    }
}
