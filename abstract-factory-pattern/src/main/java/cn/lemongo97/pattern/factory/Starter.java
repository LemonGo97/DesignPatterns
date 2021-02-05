package cn.lemongo97.pattern.factory;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        CatFactory maleFactory = new MaleCatFactory();
        CatFactory femaleFactory = new FemaleCatFactory();


        Cat maleBlackCat = maleFactory.createBlackCat();
        maleBlackCat.walk();
        maleBlackCat.jump();
        maleBlackCat.eat();
        maleBlackCat.sex();

        Cat maleOrangeCat = maleFactory.createOrangeCat();
        maleOrangeCat.walk();
        maleOrangeCat.jump();
        maleOrangeCat.eat();
        maleOrangeCat.sex();

        Cat maleTabbyCat = maleFactory.createTabbyCat();
        maleTabbyCat.walk();
        maleTabbyCat.jump();
        maleTabbyCat.eat();
        maleTabbyCat.sex();

        Cat maleWhiteCat = maleFactory.createWhiteCat();
        maleWhiteCat.walk();
        maleWhiteCat.jump();
        maleWhiteCat.eat();
        maleWhiteCat.sex();


        Cat femaleBlackCat = femaleFactory.createBlackCat();
        femaleBlackCat.walk();
        femaleBlackCat.jump();
        femaleBlackCat.eat();
        femaleBlackCat.sex();

        Cat femaleOrangeCat = femaleFactory.createOrangeCat();
        femaleOrangeCat.walk();
        femaleOrangeCat.jump();
        femaleOrangeCat.eat();
        femaleOrangeCat.sex();

        Cat femaleTabbyCat = femaleFactory.createTabbyCat();
        femaleTabbyCat.walk();
        femaleTabbyCat.jump();
        femaleTabbyCat.eat();
        femaleTabbyCat.sex();

        Cat femaleWhiteCat = femaleFactory.createWhiteCat();
        femaleWhiteCat.walk();
        femaleWhiteCat.jump();
        femaleWhiteCat.eat();
        femaleWhiteCat.sex();
    }
}
