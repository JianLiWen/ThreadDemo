package MyThread;

import common.SynBlockString;

/**
 * @author wenjianli
 * @date 2022/6/20 8:32 下午
 */
public class SynBlockThreadB extends Thread{
    private SynBlockString synBlockString;
    public SynBlockThreadB(SynBlockString synBlockString){
        super();
        this.synBlockString = synBlockString;
    }

    @Override
    public void run() {
        synBlockString.setUserNamePassword("b","bb");
    }
}
