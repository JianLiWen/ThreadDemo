package ThreadLocal.dateTest2;

/**
 * @author wenjianli
 * @date 2022/7/9 11:59 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            System.out.println("main " + Tools.t1.get());
            Thread.sleep(1000);
        }
        Thread.sleep(5000);
        ThreadA A = new ThreadA();
        A.start();
    }
}
