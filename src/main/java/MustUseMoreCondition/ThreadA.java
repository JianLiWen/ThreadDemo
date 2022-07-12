package MustUseMoreCondition;

/**
 * @author wenjianli
 * @date 2022/7/12 8:23 下午
 */
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA (MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
