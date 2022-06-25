package common;

/**
 * @author wenjianli
 * @date 2022/6/22 10:56 上午
 */
public class MyObject {
    public void speedPrintString() {
        synchronized (this){
            System.out.println("speedPrintString__getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
            System.out.println("speedPrintString release Lock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
        }
    }
}
