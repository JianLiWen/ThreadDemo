package useConditionWaitNotifyError;

/**
 * @author wenjianli
 * @date 2022/7/11 9:08 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
