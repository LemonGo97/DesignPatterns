package cn.lemongo97.pattern.bridge;

public class House extends Product{
    @Override
    public void beProduced() {
        System.out.println("生产房子。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("售卖房子。。。");
    }
}
