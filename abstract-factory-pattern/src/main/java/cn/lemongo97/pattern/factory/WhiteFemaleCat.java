package cn.lemongo97.pattern.factory;

public class WhiteFemaleCat extends AbstractWhiteCat{
    @Override
    public void sex() {
        System.out.println("i am a female cat");
    }
}
