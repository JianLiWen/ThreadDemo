package threadTest;

import MyThread.SynBlockThreadA;
import MyThread.SynBlockThreadB;
import common.SynBlockString;

/**
 * @author wenjianli
 * @date 2022/6/20 8:34 下午
 */
public class SynBlockStringTest {
    public static void main(String[] args) {
        SynBlockString synBlockString = new SynBlockString();
        SynBlockThreadA threadA = new SynBlockThreadA(synBlockString);
        threadA.setName("A");
        threadA.start();
        SynBlockThreadB threadB = new SynBlockThreadB(synBlockString);
        threadB.setName("B");
        threadB.start();
    }
}
