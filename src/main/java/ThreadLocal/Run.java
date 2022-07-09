package ThreadLocal;

/**
 * @author wenjianli
 * @date 2022/7/8 6:40 下午
 */
public class Run {
    public static ThreadLocal t = new ThreadLocal();

    public static void main(String[] args) {
        if (t.get() == null) {
            System.out.println("从未放过值");
            t.set("我的值");
        }
        System.out.println(t.get());
        System.out.println(t.get());
    }
}
