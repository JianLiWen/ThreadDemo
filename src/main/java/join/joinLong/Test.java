package join.joinLong;

/**
 * @author wenjianli
 * @date 2022/7/8 6:19 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.join(2000);
        System.out.println("end timer=" + System.currentTimeMillis());
    }
}
