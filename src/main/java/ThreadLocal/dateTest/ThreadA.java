package ThreadLocal.dateTest;

/**
 * @author wenjianli
 * @date 2022/7/9 11:41 下午
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            if (Tools.t1.get() == null ) {

            }
        }
    }
}
