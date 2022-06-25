package threadTest;

import MyThread.SyncNotExtendsThreadA;
import MyThread.SyncNotExtendsThreadB;
import common.SubSyncNotExtends;

/**
 * @author wenjianli
 * @date 2022/6/15 11:22 上午
 */
public class SyncNotExtendsTest {
    public static void main(String[] args) {
        SubSyncNotExtends subSyncNotExtends = new SubSyncNotExtends();
        SyncNotExtendsThreadA threadA = new SyncNotExtendsThreadA(subSyncNotExtends);
        threadA.setName("AA");
        threadA.start();
        SyncNotExtendsThreadA threadB = new SyncNotExtendsThreadA(subSyncNotExtends);
        threadB.setName("BB");
        threadB.start();
    }
}
