package cn.lemongo97.pattern.chain;

public class BoolHandler implements ProcessHandler{
    @Override
    public boolean handlerMessage(Object msg) {
        System.out.println("执行了BoolHandler");
        return true;
    }

    @Override
    public boolean isFit(Object msg) {
        return msg instanceof Boolean;
    }

}
