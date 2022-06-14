package MyThread;

import common.PublicVar;

/**
 * @author wenjianli
 * @date 2022/6/14 8:25 下午
 */
public class PublicVarThreadA extends Thread{
    private PublicVar publicVar;
    public PublicVarThreadA(PublicVar publicVar){
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
