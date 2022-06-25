package MyThread;

import common.ObjectService;

/**
 * @author wenjianli
 * @date 2022/6/16 10:26 上午
 */
public class DoubleSynBlockThreadB extends Thread{
    private ObjectService service;
    public DoubleSynBlockThreadB(ObjectService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
