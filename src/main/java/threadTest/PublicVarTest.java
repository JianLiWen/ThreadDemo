package threadTest;

import MyThread.PublicVarThreadA;
import common.PublicVar;

/**
 * @author wenjianli
 * @date 2022/6/14 8:26 下午
 */
public class PublicVarTest {
    public static void main(String[] args) throws InterruptedException {
        PublicVar var = new PublicVar();
        PublicVarThreadA threadA = new PublicVarThreadA(var);
        threadA.start();
        Thread.sleep(2000);
        var.getValue();
    }
}
