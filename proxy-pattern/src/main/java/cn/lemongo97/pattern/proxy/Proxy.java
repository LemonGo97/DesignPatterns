package cn.lemongo97.pattern.proxy;

public class Proxy implements IWorker {

    private IWorker worker;

    public Proxy() {
        this.worker = new WorkerOne();
    }

    public Proxy(IWorker worker) {
        this.worker = worker;
    }

    @Override
    public void action() {
        this.worker.action();
    }

    @Override
    public void action2() {
        this.worker.action2();
    }
}
