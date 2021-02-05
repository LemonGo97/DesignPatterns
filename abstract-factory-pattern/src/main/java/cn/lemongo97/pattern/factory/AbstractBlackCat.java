package cn.lemongo97.pattern.factory;

public abstract class AbstractBlackCat implements Cat{
    @Override
    public void eat() {
        System.out.println("一只玄猫正在吃饭，像个小煤球似的.....");
    }

    @Override
    public void walk() {
        System.out.println("玄猫正在优雅的踱步......");
    }

    @Override
    public void jump() {
        System.out.println("玄猫纵身一跃，跳上了一堵两米多高的墙......");
    }
}
