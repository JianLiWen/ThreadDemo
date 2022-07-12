package waitNotify.waitHasParam;

/**
 * @author wenjianli
 * @date 2022/7/6 8:10 下午
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    System.out.println("wait begin timer= " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end timer=" + System.currentTimeMillis());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    };
    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    System.out.println("notify begin timer= " + System.currentTimeMillis());
                    lock.notify();
                    System.out.println("notify end timer=" + System.currentTimeMillis());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    };
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(runnable1);
        t.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
