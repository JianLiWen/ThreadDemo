package threadTest;

import MyThread.MyThread2;

/**
 * @author wenjianli
 * @date 2022/6/1 8:36 下午
 */
public class Run {
    public static void main(String[] args) {
        MyThread2 a = new MyThread2("A");
        MyThread2 b = new MyThread2("B");
        MyThread2 c = new MyThread2("C");
        a.start();
        b.start();
        c.start();
    }
}
