package MyThread;

import common.ObjectService;

/**
 * @author wenjianli
 * @date 2022/6/16 10:26 上午
 */
public class DoubleSynBlockThreadA extends Thread{
    private ObjectService service;
    public DoubleSynBlockThreadA(ObjectService service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
