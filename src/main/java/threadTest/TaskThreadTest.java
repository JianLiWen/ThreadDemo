package threadTest;

import MyThread.TaskThreadA;
import MyThread.TaskThreadB;
import common.Task;

/**
 * @author wenjianli
 * @date 2022/6/16 9:43 上午
 */
public class TaskThreadTest {
    public static void main(String[] args) {
        Task task = new Task();
        TaskThreadA threadA = new TaskThreadA(task);
        threadA.start();
        TaskThreadB threadB = new TaskThreadB(task);
        threadB.start();
    }
}
