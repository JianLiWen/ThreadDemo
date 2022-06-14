package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 8:06 下午
 */
public class MyObject2 {
    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try{
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName()+ " beginTime=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
