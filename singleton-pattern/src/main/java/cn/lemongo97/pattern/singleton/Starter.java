package cn.lemongo97.pattern.singleton;

public class Starter {
    public static void main(String[] args) {
        SingletonInstance instance = SingletonInstance.getInstance();
        instance.doAction();
        instance = SingletonInstance.getInstance();
        instance.doAction();
    }
}
