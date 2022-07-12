package join;

/**
 * @author wenjianli
 * @date 2022/7/7 11:36 上午
 */
public class Test {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            thread.join();
            System.out.println("最后执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
