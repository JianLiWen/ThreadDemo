package ThreadLocal;

/**
 * @author wenjianli
 * @date 2022/7/9 11:32 下午
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<100;i++){
                Tools.t1.set("ThreadA" + (i+1));
                System.out.println("ThreadA getValue=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
