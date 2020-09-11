package appliedalgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @description: 滑动窗口
 * @author: movesan
 * @create: 2020-09-05 20:33
 **/
public class SlidingWindow {

    Queue<String> workQueue = new LinkedBlockingQueue<>(5);

    public static void slidingWindow() {
        // 初始化窗口大小

        List<String> list = new ArrayList<>();
        for (String work : list) {
            doWork(work);
        }
    }

    public static void doWork(String work) {
        // 通过阻塞队列实现，当未满时加入线程处理
        if (!isFull()) {
            // 异步处理
            doWorkAsyn(work);
        } else {
            // wait 等待
        }
    }

    public static boolean isFull() {
        return false;
    }

    public static void doWorkAsyn(String work) {
        // 处理业务逻辑

        // 处理完成后，提交处理完成操作

        // 如果当前任务为窗口内第一个，则任务出队，唤醒等待线程
    }
}
