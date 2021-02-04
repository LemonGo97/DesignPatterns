package cn.lemongo97.pattern.strategy;

public class Starter {

    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyFirst());
        context.operate();
        context = new Context(new StrategySecond());
        context.operate();
        context = new Context(new StrategyThird());
        context.operate();
    }

}
