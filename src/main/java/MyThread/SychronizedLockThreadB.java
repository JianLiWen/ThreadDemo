package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 7:57 下午
 */
public class SychronizedLockThreadB extends Thread{
    private MyObject object;
    public SychronizedLockThreadB(MyObject object){
        super();
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
