package MyThread;

import common.MyObject;
import common.MyObjectService;

/**
 * @author wenjianli
 * @date 2022/6/22 10:59 上午
 */
public class ObjectServiceThreadA extends Thread{
    private MyObject object;
    private MyObjectService service;
    public ObjectServiceThreadA(MyObjectService service, MyObject object){
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
