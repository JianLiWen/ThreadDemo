package MyThread;

import common.Service;

/**
 * @author wenjianli
 * @date 2022/6/15 9:27 上午
 */
public class ServiceThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
