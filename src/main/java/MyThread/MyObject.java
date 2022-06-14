package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 7:58 下午
 */
public class MyObject {
    synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
