package cn.lemongo97.pattern.bridge;

public class IpodCrop extends Corp{

    public IpodCrop(Ipod ipod) {
        super(ipod);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚大钱了");
    }
}
