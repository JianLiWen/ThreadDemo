package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/1 8:31 下午
 */
public class MyThread2 extends Thread{
    private int count = 5;
    public MyThread2(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run() {
        super.run();
        while (count >0){
            count--;
            System.out.println("由"+ Thread.currentThread().getName() + "计算，count="+ count);
        }
    }
}
