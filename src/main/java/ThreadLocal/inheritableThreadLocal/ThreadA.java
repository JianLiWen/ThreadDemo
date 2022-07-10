package ThreadLocal.inheritableThreadLocal;

/**
 * @author wenjianli
 * @date 2022/7/9 11:32 下午
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("ThreadA getValue=" + Tools.t1.get());

            Thread.sleep(100);
//            for(int i=0;i<10;i++){
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
