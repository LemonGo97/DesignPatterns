package cn.lemongo97.pattern.proxy;

public class Starter {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.action();
        proxy.action2();
        proxy = new Proxy(new WorkerTwo());
        proxy.action();
        proxy.action2();
    }

}
