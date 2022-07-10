package reentrantLock;

/**
 * @author wenjianli
 * @date 2022/7/10 10:28 下午
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread a1 = new MyThread(service);
        MyThread a2 = new MyThread(service);
        MyThread a3 = new MyThread(service);
        a1.start();
        a2.start();
        a3.start();
    }
}
