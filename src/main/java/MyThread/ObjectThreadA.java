package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 8:10 下午
 */
public class ObjectThreadA extends Thread{
    private MyObject2 object2;

    public ObjectThreadA(MyObject2 object2) {
        super();
        this.object2 = object2;
    }

    @Override
    public void run() {
        super.run();
        object2.methodA();
    }
}
