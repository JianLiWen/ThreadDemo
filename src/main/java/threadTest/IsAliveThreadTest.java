package threadTest;

import MyThread.IsAliveThread;

/**
 * @author wenjianli
 * @date 2022/6/2 10:30 上午
 */
public class IsAliveThreadTest {
    public static void main(String[] args) throws InterruptedException {
        IsAliveThread thread = new IsAliveThread();
        System.out.println("begin==" + thread.isAlive());
        thread.start();
        Thread.sleep(1000);
        System.out.println("end==" + thread.isAlive());

    }
}
