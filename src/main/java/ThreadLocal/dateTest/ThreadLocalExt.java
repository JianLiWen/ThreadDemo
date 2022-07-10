package ThreadLocal.dateTest;

/**
 * @author wenjianli
 * @date 2022/7/9 11:50 下午
 */
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return "第一次不为null";
    }
}
