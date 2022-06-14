package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 7:57 下午
 */
public class SychronizedLockThreadA extends Thread{
    private MyObject object;
    public SychronizedLockThreadA(MyObject object){
        super();
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
