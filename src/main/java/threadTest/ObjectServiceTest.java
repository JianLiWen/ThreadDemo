package threadTest;

import MyThread.ObjectServiceThreadA;
import MyThread.ObjectServiceThreadB;
import common.MyObject;
import common.MyObjectService;

/**
 * @author wenjianli
 * @date 2022/6/22 11:01 上午
 */
public class ObjectServiceTest {
    public static void main(String[] args) {
        MyObjectService service = new MyObjectService();
        MyObject object1 = new MyObject();
        ObjectServiceThreadA threadA = new ObjectServiceThreadA(service,object1);
        threadA.setName("A");
        threadA.start();
        ObjectServiceThreadB threadB = new ObjectServiceThreadB(object1);
        threadB.setName("B");
        threadB.start();
    }
}
