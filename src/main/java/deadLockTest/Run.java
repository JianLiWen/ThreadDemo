package deadLockTest;

/**
 * @author wenjianli
 * @date 2022/6/22 2:08 下午
 */
public class Run {
    public static void main(String[] args) {
        try{
            DeadThread t1 = new DeadThread();
            t1.setFlag("a");
            Thread thread1 = new Thread();
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread();
            thread2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
