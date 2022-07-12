package ProducerConsumer;

/**
 * @author wenjianli
 * @date 2022/7/7 10:19 上午
 */
public class PThread extends Thread{
    private  P p;
    public PThread (P p){
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
