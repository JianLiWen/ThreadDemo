package ThreadLocal;

/**
 * @author wenjianli
 * @date 2022/7/9 11:35 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.start();
        for(int i=0;i<100;i++){
            Tools.t1.set("Main" + (i+1));
            System.out.println("Main getValue=" + Tools.t1.get());
            Thread.sleep(200);
        }
    }
}
