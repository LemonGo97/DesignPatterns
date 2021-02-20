package cn.lemongo97.pattern.bridge;

public class Clothes extends Product{
    @Override
    public void beProduced() {
        System.out.println("生产服装。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("售卖服装。。。");
    }
}
