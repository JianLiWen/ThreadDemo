package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/2 9:48 上午
 */
public class MyThread3 extends Thread{
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由"+ Thread.currentThread().getName() + "计算，count="+ count);
    }
}
