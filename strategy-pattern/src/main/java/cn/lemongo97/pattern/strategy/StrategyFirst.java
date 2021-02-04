package cn.lemongo97.pattern.strategy;

public class StrategyFirst implements IStrategy{
    @Override
    public void operate() {
        System.out.println("策略第一条");
    }
}
