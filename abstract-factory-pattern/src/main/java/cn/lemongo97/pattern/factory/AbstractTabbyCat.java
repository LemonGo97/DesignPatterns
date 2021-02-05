package cn.lemongo97.pattern.factory;

public abstract class AbstractTabbyCat implements Cat{
    @Override
    public void eat() {
        System.out.println("好看的狸花猫正在吃东西......");
    }

    @Override
    public void walk() {
        System.out.println("这只美丽的小狸花朝着小橘跑去......");
    }

    @Override
    public void jump() {
        System.out.println("小狸花没有跳，它只是跑到小橘身边安慰小橘......");
    }
}
