package Threads.ThreadPriority.Golovach.Interrupt;

/**
 * Created by WhiteMountiens on 27.07.2014.
 */
public class ThreadNode {

    public final Thread thread;
    public final ThreadNode nextNode;

    public ThreadNode(Thread thread, ThreadNode nextNode) {
        this.thread = thread;
        this.nextNode = nextNode;
    }



}
