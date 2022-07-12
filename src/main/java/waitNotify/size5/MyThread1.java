package waitNotify.size5;

/**
 * @author wenjianli
 * @date 2022/7/3 8:53 下午
 */
public class MyThread1 extends Thread{
    private Object lock;
    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock) {
                if (MyList.getSize() != 5){
                    System.out.println("开始  wait begin=" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("结束  wait end=" + System.currentTimeMillis());
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
