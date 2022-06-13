package threadTest;

import MyThread.YieldThread;

/**
 * @author wenjianli
 * @date 2022/6/13 11:27 上午
 */
public class yieldThreadTest {
    public static void main(String[] args) {
        YieldThread thread  = new YieldThread();
        thread.start();
    }
}
