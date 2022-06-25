package common;

/**
 * @author wenjianli
 * @date 2022/6/15 11:19 上午
 */
public class SubSyncNotExtends extends SynNotExtends{
    @Override
    synchronized public  void serviceMethod() {
        try{
            System.out.println("int sub 下一步sleep begin threadName=" + Thread.currentThread().getName()+ " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            super.serviceMethod();
        }catch (Exception e){
            e.printStackTrace();
        }    }
}
