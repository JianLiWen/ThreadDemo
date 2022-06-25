package MyThread;

import common.Task;

/**
 * @author wenjianli
 * @date 2022/6/16 9:42 上午
 */
public class TaskThreadB extends Thread{
    private Task task;
    public TaskThreadB(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
