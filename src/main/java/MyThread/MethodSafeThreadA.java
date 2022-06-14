package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 9:29 上午
 */
public class MethodSafeThreadA extends Thread{
    private HasSelfPrivateNum numRef;
    public MethodSafeThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addl("a");
    }
}
