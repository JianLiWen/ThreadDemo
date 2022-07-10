package reentrantLock;

/**
 * @author wenjianli
 * @date 2022/7/10 10:08 下午
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
