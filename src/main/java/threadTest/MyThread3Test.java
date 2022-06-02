package threadTest;

import MyThread.MyThread3;

/**
 * @author wenjianli
 * @date 2022/6/2 9:50 上午
 */
public class MyThread3Test {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        Thread a = new Thread(myThread3,"A");
        Thread b = new Thread(myThread3,"B");
        Thread c = new Thread(myThread3,"C");
        Thread d = new Thread(myThread3,"D");
        Thread e = new Thread(myThread3,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
