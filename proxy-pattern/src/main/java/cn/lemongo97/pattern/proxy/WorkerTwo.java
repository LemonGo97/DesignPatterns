package cn.lemongo97.pattern.proxy;

public class WorkerTwo implements IWorker {
    @Override
    public void action() {
        System.out.println("WorkerTwo do action1");
    }

    @Override
    public void action2() {
        System.out.println("WorkerTwo do action2");
    }
}
