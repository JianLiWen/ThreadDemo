package ProducerConsumer;

/**
 * @author wenjianli
 * @date 2022/7/7 10:21 上午
 */
public class test {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        PThread pThread = new PThread(p);
        CThread cThread = new CThread(c);
        pThread.start();
        cThread.start();
    }
}
