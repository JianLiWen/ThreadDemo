package join;

/**
 * @author wenjianli
 * @date 2022/7/7 11:30 上午
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try{
            int secondValue = (int) (Math.random() * 1000);
            System.out.println(secondValue);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
