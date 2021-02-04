package cn.lemongo97.pattern.strategy;

public class StrategySecond implements IStrategy{
    @Override
    public void operate() {
        System.out.println("策略第二条");
    }
}
