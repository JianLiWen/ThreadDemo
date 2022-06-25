package common;

/**
 * @author wenjianli
 * @date 2022/6/22 10:56 上午
 */
public class MyObjectService {
    public void testMethod1(MyObject object){
        synchronized (object){
            try{
                System.out.println("testMethod1__getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 release Lock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
