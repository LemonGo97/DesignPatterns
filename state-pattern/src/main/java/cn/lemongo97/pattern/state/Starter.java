package cn.lemongo97.pattern.state;


public class Starter {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new CloseingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }

}
