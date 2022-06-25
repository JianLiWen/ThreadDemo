package MyThread;

import common.SynBlockString;

/**
 * @author wenjianli
 * @date 2022/6/20 8:32 下午
 */
public class SynBlockThreadA extends Thread{
    private SynBlockString synBlockString;
    public SynBlockThreadA(SynBlockString synBlockString){
        super();
        this.synBlockString = synBlockString;
    }

    @Override
    public void run() {
        synBlockString.setUserNamePassword("a","aa");
    }
}
