package cn.lemongo97.pattern.chain;

public class IntHandler implements ProcessHandler{
    @Override
    public boolean handlerMessage(Object msg) {
        System.out.println("执行了IntHandler");
        return false;
    }


    @Override
    public boolean isFit(Object msg) {
        return msg instanceof Integer;
    }
}
