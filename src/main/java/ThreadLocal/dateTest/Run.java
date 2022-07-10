package ThreadLocal.dateTest;

/**
 * @author wenjianli
 * @date 2022/7/9 11:51 下午
 */
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();
    public static ThreadLocal t2 = new ThreadLocal();
    public static void main(String[] args) {
        if (t1.get() == null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
