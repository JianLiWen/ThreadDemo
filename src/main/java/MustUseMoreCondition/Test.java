package MustUseMoreCondition;

/**
 * @author wenjianli
 * @date 2022/7/12 8:24 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
        Thread.sleep(3000);
        service.signalA();
    }
}
