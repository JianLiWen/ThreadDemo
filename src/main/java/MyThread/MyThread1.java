package MyThread;

/**
 * @author wenjianli
 * @date 2022/4/12 8:37 下午
 */
public class MyThread1 extends Thread{
    private int i;
    public MyThread1(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
