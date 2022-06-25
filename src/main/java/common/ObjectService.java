package common;

/**
 * @author wenjianli
 * @date 2022/6/16 10:00 上午
 */
public class ObjectService {
    public void serviceMethodA(){
        try {
            synchronized (this){
                System.out.println(" A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println(" A end end=" + System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time=" + System.currentTimeMillis());
            System.out.println("B end end=" + System.currentTimeMillis());
        }
    }
}
