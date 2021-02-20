package cn.lemongo97.pattern.bridge;

public class ClothesCrop extends Corp{
    public ClothesCrop(Clothes clothes) {
        super(clothes);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚了点小钱");
    }
}
