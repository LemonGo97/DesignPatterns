package cn.lemongo97.pattern.model;

public class Starter {

    public static void main(String[] args) {
        HummerModel model = new HummerH1Model();
        model.setAlarmFlag(false);
        model.run();
        model = new HummerH2Model();
        model.run();
    }

}
