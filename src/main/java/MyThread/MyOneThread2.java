package MyThread;

import common.MyOneList;
import common.MyOneService;

/**
 * @author wenjianli
 * @date 2022/6/20 9:31 下午
 */
public class MyOneThread2 extends Thread{
    private MyOneList list;
    public MyOneThread2(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyOneService service = new MyOneService();
        service.addServiceMethod(list,"B");
    }
}
