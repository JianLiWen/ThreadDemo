package AtomicTest;

/**
 * @author wenjianli
 * @date 2022/6/30 8:32 下午
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicIntegerThread countService = new AtomicIntegerThread();
        Thread t1 = new Thread(countService);
        t1.start();
        Thread t2 = new Thread(countService);
        t2.start();
        Thread t3 = new Thread(countService);
        t3.start();
        Thread t4 = new Thread(countService);
        t4.start();
        Thread t5 = new Thread(countService);
        t5.start();
    }
}
