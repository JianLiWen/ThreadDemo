package ThreadLocal.dateTest;

/**
 * @author wenjianli
 * @date 2022/7/9 11:46 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadA A = new ThreadA();
        A.start();
        Thread.sleep(1000);
        ThreadB B = new ThreadB();
        B.start();
    }
}
