package join;

/**
 * @author wenjianli
 * @date 2022/7/8 6:11 下午
 */
public class Teat {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        Thread.sleep(500);
        ThreadC threadC = new ThreadC(threadB);
        threadC.start();
    }
}
