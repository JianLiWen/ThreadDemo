package ThreadLocal.inheritableThreadLocal;

/**
 * @author wenjianli
 * @date 2022/7/9 11:59 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main " + Tools.t1.get());
//        for(int i=0;i<10;i++){
//            Thread.sleep(1000);
//        }
        Thread.sleep(500);
        ThreadA A = new ThreadA();
        A.start();
        Tools.t1.set("yyyy");

    }
}
