package MyThread;

import common.Task;

/**
 * @author wenjianli
 * @date 2022/6/16 9:42 上午
 */
public class TaskThreadA extends Thread{
    private Task task;
    public TaskThreadA(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
