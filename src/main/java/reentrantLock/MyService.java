package reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wenjianli
 * @date 2022/7/10 9:49 下午
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod() {
        lock.lock();
        for(int i=0;i<3;i++){
            System.out.println("ThreadName=" + Thread.currentThread().getName() + ("" + (i+1)));
        }
        lock.unlock();
    }
}
