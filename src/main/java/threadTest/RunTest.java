package threadTest;

import MyThread.RunThread;

/**
 * @author wenjianli
 * @date 2022/6/28 7:23 下午
 */
public class RunTest {
    public static void main(String[] args) {
        try{
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为false");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
