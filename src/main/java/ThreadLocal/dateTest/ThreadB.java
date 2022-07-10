package ThreadLocal.dateTest;

import java.util.Date;

/**
 * @author wenjianli
 * @date 2022/7/9 11:41 下午
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            if (Tools.t1.get() == null ) {
                Tools.t1.set(new Date());
            }
            System.out.println("B " + Tools.t1.get().getTime());
            try {
                ThreadB.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
