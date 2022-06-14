package threadTest;

import MyThread.HasSelfPrivateNum;
import MyThread.MethodSafeThreadA;
import MyThread.MethodSafeThreadB;

/**
 * @author wenjianli
 * @date 2022/6/14 9:30 上午
 */
public class MethodSafeThreadTest2 {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        MethodSafeThreadA threadA = new MethodSafeThreadA(numRef);
        threadA.start();
        MethodSafeThreadB threadB = new MethodSafeThreadB(numRef2);
        threadB.start();
    }
}
