package threadTest;

import MyThread.ServiceThread;

/**
 * @author wenjianli
 * @date 2022/6/15 9:28 上午
 */
public class ServiceTest {
    public static void main(String[] args) {
        ServiceThread thread = new ServiceThread();
        thread.start();
    }
}
