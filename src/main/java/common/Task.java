package common;

/**
 * @author wenjianli
 * @date 2022/6/16 9:37 上午
 */
public class Task {
    public void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
        }
        System.out.println("");
        synchronized (this){
            for(int i=0;i<100;i++){
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
