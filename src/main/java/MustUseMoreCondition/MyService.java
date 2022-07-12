package MustUseMoreCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wenjianli
 * @date 2022/7/12 8:15 下午
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    public void awaitA(){
        try{
            lock.lock();
            System.out.println("start await时间：" + System.currentTimeMillis() + "线程：" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end await时间：" + System.currentTimeMillis() + "线程：" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void awaitB(){
        try{
            lock.lock();
            System.out.println("start await时间：" + System.currentTimeMillis() + "线程：" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end await时间：" + System.currentTimeMillis() + "线程：" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signalA(){
        try{
            lock.lock();
            conditionA.signalAll();
            System.out.println("signal A 时间：" + System.currentTimeMillis() + "线程：" + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
    public void signalB(){
        try{
            lock.lock();
            conditionB.signalAll();
            System.out.println("signal B 时间：" + System.currentTimeMillis() + "线程：" + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
