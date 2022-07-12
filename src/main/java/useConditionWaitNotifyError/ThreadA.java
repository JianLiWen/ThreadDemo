package useConditionWaitNotifyError;

/**
 * @author wenjianli
 * @date 2022/7/11 9:07 下午
 */
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA (MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
