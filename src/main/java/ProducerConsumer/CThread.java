package ProducerConsumer;

/**
 * @author wenjianli
 * @date 2022/7/7 10:19 上午
 */
public class CThread extends Thread{
    private  C c;
    public CThread(C c){
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
