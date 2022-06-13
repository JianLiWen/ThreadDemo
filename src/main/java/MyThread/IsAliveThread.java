package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/2 10:29 上午
 */
public class IsAliveThread extends Thread{
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }

}
