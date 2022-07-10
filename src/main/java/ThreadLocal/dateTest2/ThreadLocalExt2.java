package ThreadLocal.dateTest2;

import java.util.Date;

/**
 * @author wenjianli
 * @date 2022/7/9 11:50 下午
 */
public class ThreadLocalExt2 extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
