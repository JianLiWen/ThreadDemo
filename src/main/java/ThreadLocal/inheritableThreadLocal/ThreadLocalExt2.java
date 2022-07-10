package ThreadLocal.inheritableThreadLocal;

import java.util.Date;

/**
 * @author wenjianli
 * @date 2022/7/9 11:50 下午
 */
public class ThreadLocalExt2 extends InheritableThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
