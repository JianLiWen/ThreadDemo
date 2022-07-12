package AtomicTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wenjianli
 * @date 2022/6/30 8:30 下午
 */
public class AtomicIntegerThread extends Thread{
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
