package threadTest;

import MyThread.DoubleSynBlockThreadA;
import MyThread.DoubleSynBlockThreadB;
import common.ObjectService;

/**
 * @author wenjianli
 * @date 2022/6/16 10:27 上午
 */
public class DoubleSynBlockTest {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        DoubleSynBlockThreadA threadA = new DoubleSynBlockThreadA(service);
        threadA.setName("A");
        threadA.start();
        DoubleSynBlockThreadB threadB = new DoubleSynBlockThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
