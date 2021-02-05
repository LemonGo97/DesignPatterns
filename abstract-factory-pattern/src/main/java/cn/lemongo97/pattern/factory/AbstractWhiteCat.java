package cn.lemongo97.pattern.factory;

public abstract class AbstractWhiteCat implements Cat{
    @Override
    public void eat() {
        System.out.println("一只可爱的小白猫正在吃它的午餐......");
    }

    @Override
    public void walk() {
        System.out.println("小白正在巡视领地......");
    }

    @Override
    public void jump() {
        System.out.println("小白跳到了和小黑一样高的墙......");
    }
}
