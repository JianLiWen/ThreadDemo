package waitNotify.size5;

/**
 * @author wenjianli
 * @date 2022/7/3 8:53 下午
 */
public class MyThread2 extends Thread{
    private Object lock;
    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for(int i=0;i<10;i++) {
                MyList.add();
                if (MyList.getSize() == 5){
                    lock.notify();
                    System.out.println("已发出通知");
                }
                System.out.println("添加了" + (i+1) + "个元素");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
