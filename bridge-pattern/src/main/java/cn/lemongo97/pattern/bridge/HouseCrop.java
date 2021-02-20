package cn.lemongo97.pattern.bridge;

public class HouseCrop extends Corp{

    public HouseCrop(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了");
    }
}
