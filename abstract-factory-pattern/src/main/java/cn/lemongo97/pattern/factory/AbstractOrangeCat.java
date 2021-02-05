package cn.lemongo97.pattern.factory;

public abstract class AbstractOrangeCat implements Cat{
    @Override
    public void eat() {
        System.out.println("一直好看的橘猫正在大快朵颐......");
    }

    @Override
    public void walk() {
        System.out.println("橘子摇晃着胖乎乎的身体超着远方跑去......");
    }

    @Override
    public void jump() {
        System.out.println("呀！橘子有点重，跳不到那么高的墙上，但是它把墙弄塌了......");
    }
}
