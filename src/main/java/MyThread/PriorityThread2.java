package MyThread;

import java.util.Random;

/**
 * @author wenjianli
 * @date 2022/6/13 2:41 下午
 */
public class PriorityThread2 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j=0;j<10;j++){
            for (int i=0;i<50000;i++){
                Random random = new Random();
                random.nextInt();
                addResult = addResult+i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("!!!!!!!thread2 use time=" + (endTime-beginTime));
    }
}
