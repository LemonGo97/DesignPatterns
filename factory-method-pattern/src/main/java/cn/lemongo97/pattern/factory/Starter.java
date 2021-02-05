package cn.lemongo97.pattern.factory;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        Cat blackCat = CatFactory.createCat(BlackCat.class);
        blackCat.eat();
        blackCat.jump();
        blackCat.walk();

        Cat orangeCat = CatFactory.createCat(OrangeCat.class);
        orangeCat.eat();
        orangeCat.jump();
        orangeCat.walk();

        Cat tabbyCat = CatFactory.createCat(TabbyCat.class);
        tabbyCat.eat();
        tabbyCat.jump();
        tabbyCat.walk();

        Cat whiteCat = CatFactory.createCat(WhiteCat.class);
        whiteCat.eat();
        whiteCat.jump();
        whiteCat.walk();

        Thread.sleep(1000);

        System.out.println("=============> 随机产生一只小猫！！");
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1000);
            Cat cat = CatFactory.createCat();
            cat.eat();
            cat.jump();
            cat.walk();
        }
    }
}
