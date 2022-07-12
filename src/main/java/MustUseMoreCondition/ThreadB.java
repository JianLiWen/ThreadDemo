package MustUseMoreCondition;

/**
 * @author wenjianli
 * @date 2022/7/12 8:23 下午
 */
public class ThreadB extends Thread{
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
