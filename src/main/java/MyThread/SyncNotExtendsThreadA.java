package MyThread;

import common.SubSyncNotExtends;

/**
 * @author wenjianli
 * @date 2022/6/15 11:20 上午
 */
public class SyncNotExtendsThreadA extends Thread{
    private SubSyncNotExtends subSyncNotExtends;
    public SyncNotExtendsThreadA(SubSyncNotExtends subSyncNotExtends){
        super();
        this.subSyncNotExtends = subSyncNotExtends;
    }

    @Override
    public void run() {
        subSyncNotExtends.serviceMethod();
    }
}
