package MyThread;

import common.MyObject;
import common.MyObjectService;

/**
 * @author wenjianli
 * @date 2022/6/22 10:59 上午
 */
public class ObjectServiceThreadB extends Thread{
    private MyObject object;
    public ObjectServiceThreadB(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
