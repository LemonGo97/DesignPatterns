package cn.lemongo97.pattern.bridge;

public class FakeCrop extends Corp{
    public FakeCrop(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚钱了");
    }
}
