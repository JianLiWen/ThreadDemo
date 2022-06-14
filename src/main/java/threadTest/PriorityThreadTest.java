package threadTest;

import MyThread.PriorityThread;
import MyThread.PriorityThread2;

/**
 * @author wenjianli
 * @date 2022/6/13 2:44 下午
 */
public class PriorityThreadTest {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            PriorityThread thread1 = new PriorityThread();
            thread1.setPriority(1);
            thread1.start();
            PriorityThread2 thread2 = new PriorityThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
