package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/28 7:18 下午
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;
    public boolean isRunning() {
        return isRunning;
    }
    public void setRunning(boolean isRunning){
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true){
        }
        System.out.println("线程停止了");
    }
}
