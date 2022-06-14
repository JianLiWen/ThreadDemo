package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 9:29 上午
 */
public class MethodSafeThreadB extends Thread{
    private HasSelfPrivateNum numRef;
    public MethodSafeThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addl("b");
    }
}
