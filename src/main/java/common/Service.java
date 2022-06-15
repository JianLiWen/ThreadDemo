package common;

/**
 * @author wenjianli
 * @date 2022/6/14 9:06 下午
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("service3");
    }
}
