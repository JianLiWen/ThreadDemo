package common;

/**
 * @author wenjianli
 * @date 2022/6/15 11:10 上午
 */
public class SynNotExtends {

    synchronized public void  serviceMethod(){
        try{
            System.out.println("int main 下一步sleep begin threadName=" + Thread.currentThread().getName()+ " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步 sleep end threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
