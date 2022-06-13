package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/13 11:24 上午
 */
public class YieldThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count= 0;
        for(int i=0;i<50000000;i++){
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime-beginTime) + " 毫秒！");
    }
}
