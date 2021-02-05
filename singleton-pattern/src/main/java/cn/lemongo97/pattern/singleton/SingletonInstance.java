package cn.lemongo97.pattern.singleton;

public class SingletonInstance {

    private static final SingletonInstance instance = new SingletonInstance();

    private SingletonInstance() {
    }

    public synchronized static SingletonInstance getInstance() {
        return instance;
    }

    public void doAction(){
        System.out.println("I am SingletonInstance !");
    }

}
