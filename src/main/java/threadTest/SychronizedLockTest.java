package threadTest;

import MyThread.MyObject;
import MyThread.SychronizedLockThreadA;
import MyThread.SychronizedLockThreadB;

/**
 * @author wenjianli
 * @date 2022/6/14 8:00 下午
 */
public class SychronizedLockTest {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        SychronizedLockThreadA threadA = new SychronizedLockThreadA(object);
        threadA.setName("a");
        SychronizedLockThreadB threadB = new SychronizedLockThreadB(object);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
