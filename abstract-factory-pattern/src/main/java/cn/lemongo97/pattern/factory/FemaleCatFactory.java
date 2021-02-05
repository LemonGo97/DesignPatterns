package cn.lemongo97.pattern.factory;

public class FemaleCatFactory extends AbstractCatFactory{
    @Override
    public Cat createBlackCat() {
        return super.createCat(CatEnum.BlackFemaleCat);
    }

    @Override
    public Cat createOrangeCat() {
        return super.createCat(CatEnum.OrangeFemaleCat);
    }

    @Override
    public Cat createTabbyCat() {
        return super.createCat(CatEnum.TabbyFemaleCat);
    }

    @Override
    public Cat createWhiteCat() {
        return super.createCat(CatEnum.WhiteFemaleCat);
    }
}
