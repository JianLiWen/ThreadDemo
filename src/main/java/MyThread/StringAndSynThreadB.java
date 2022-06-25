package MyThread;

import common.StringAndSyn;

/**
 * @author wenjianli
 * @date 2022/6/22 11:26 上午
 */
public class StringAndSynThreadB extends Thread{
    private StringAndSyn stringAndSyn;
    public StringAndSynThreadB(StringAndSyn stringAndSyn){
        super();
        this.stringAndSyn = stringAndSyn;
    }

    @Override
    public void run() {
        stringAndSyn.print("BB");
    }
}
