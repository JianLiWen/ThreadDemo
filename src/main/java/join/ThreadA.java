package join;

/**
 * @author wenjianli
 * @date 2022/7/7 11:51 上午
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i=0;i<Integer.MAX_VALUE;i++) {
            String newString = new String();
            Math.random();
        }
    }
}
