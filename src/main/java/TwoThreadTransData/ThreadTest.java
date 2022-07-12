package TwoThreadTransData;

/**
 * @author wenjianli
 * @date 2022/7/3 8:41 下午
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
