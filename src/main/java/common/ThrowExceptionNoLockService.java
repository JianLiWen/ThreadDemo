package common;

/**
 * @author wenjianli
 * @date 2022/6/15 10:30 上午
 */
public class ThrowExceptionNoLockService {
    public void testMethod(){
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " run begin Time=" + System.currentTimeMillis());
            int i=1;
            while (i==1){
                if (("" + Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + " run exceptionTime=" + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("Thread B run Time=" + System.currentTimeMillis());
        }
    }
}
