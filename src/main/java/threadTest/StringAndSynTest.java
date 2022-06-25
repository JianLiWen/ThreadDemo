package threadTest;

import MyThread.DoubleSynBlockThreadA;
import MyThread.DoubleSynBlockThreadB;
import MyThread.StringAndSynThreadA;
import MyThread.StringAndSynThreadB;
import common.ObjectService;
import common.StringAndSyn;

/**
 * @author wenjianli
 * @date 2022/6/16 10:27 上午
 */
public class StringAndSynTest {
    public static void main(String[] args) {
        StringAndSyn service = new StringAndSyn();
        StringAndSynThreadA threadA = new StringAndSynThreadA(service);
        threadA.setName("A");
        threadA.start();
        StringAndSynThreadB threadB = new StringAndSynThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
