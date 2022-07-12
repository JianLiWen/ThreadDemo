package join.joinLong;

/**
 * @author wenjianli
 * @date 2022/7/8 6:17 下午
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
