package threadTest;

import MyThread.ThrowExceptionThreadA;
import MyThread.ThrowExceptionThreadB;
import common.ThrowExceptionNoLockService;

/**
 * @author wenjianli
 * @date 2022/6/15 10:36 上午
 */
public class ThrowExceptionTest {
    public static void main(String[] args) throws InterruptedException {
        ThrowExceptionNoLockService service  = new ThrowExceptionNoLockService();
        ThrowExceptionThreadA threadA = new ThrowExceptionThreadA(service);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(500);
        ThrowExceptionThreadB threadB = new ThrowExceptionThreadB(service);
        threadB.setName("b");
        threadB.start();

    }
}
