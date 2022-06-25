package MyThread;

import common.ThrowExceptionNoLockService;

/**
 * @author wenjianli
 * @date 2022/6/15 10:35 上午
 */
public class ThrowExceptionThreadB extends Thread{
    private ThrowExceptionNoLockService throwExceptionNoLockService;

    public ThrowExceptionThreadB(ThrowExceptionNoLockService throwExceptionNoLockService){
        super();
        this.throwExceptionNoLockService = throwExceptionNoLockService;
    }

    @Override
    public void run() {
        throwExceptionNoLockService.testMethod();
    }
}
