package cn.lemongo97.pattern.proxy;

public class WorkerOne implements IWorker {
    @Override
    public void action() {
        System.out.println("WorkerOne do action1");
    }

    @Override
    public void action2() {
        System.out.println("WorkerOne do action2");
    }
}
