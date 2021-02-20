package cn.lemongo97.pattern.bridge;

public class Starter {

    public static void main(String[] args) {
        System.out.println("------ 房地产公司运作 ------");
        Corp houseCrop = new HouseCrop(new House());
        houseCrop.makeMoney();
        System.out.println('\n');
        System.out.println("------ 服装公司运作 ------");
        Corp clothesCrop = new ClothesCrop(new Clothes());
        clothesCrop.makeMoney();
        System.out.println('\n');
        System.out.println("------ 山寨公司运作 ------");
        Corp fakeCrop = new FakeCrop(new Ipod());
        fakeCrop.makeMoney();
        fakeCrop = new FakeCrop(new House());
        fakeCrop.makeMoney();
        fakeCrop = new FakeCrop(new Clothes());
        fakeCrop.makeMoney();
    }

}
