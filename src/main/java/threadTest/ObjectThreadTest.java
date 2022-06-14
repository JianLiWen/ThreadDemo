package threadTest;

import MyThread.MyObject2;
import MyThread.ObjectThreadA;
import MyThread.ObjectThreadB;

/**
 * @author wenjianli
 * @date 2022/6/14 8:12 下午
 */
public class ObjectThreadTest {
    public static void main(String[] args) {
        MyObject2 object2 = new MyObject2();
        ObjectThreadA threadA = new ObjectThreadA(object2);
        threadA.setName("a");
        ObjectThreadB threadB = new ObjectThreadB(object2);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
