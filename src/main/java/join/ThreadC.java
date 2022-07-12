package join;

/**
 * @author wenjianli
 * @date 2022/7/7 11:51 上午
 */
public class ThreadC extends Thread{
    private ThreadB threadB;
    public ThreadC (ThreadB threadB) {
        super();
        this.threadB = threadB;
    }
    @Override
    public void run() {
       threadB.interrupt();
    }
}
