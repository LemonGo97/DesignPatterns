package cn.lemongo97.pattern.bridge;

public class Ipod extends Product{
    @Override
    public void beProduced() {
        System.out.println("生产Ipod。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("售卖Ipod。。。");
    }
}
