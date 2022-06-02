package threadTest;

import MyThread.MyRunnable;

/**
 * @author wenjianli
 * @date 2022/4/29 4:48 下午
 */
public class RunnableTest {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread myThread = new Thread(runnable);
        myThread.start();
        System.out.println("运行结束！");
    }

}
