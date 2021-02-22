package cn.lemongo97.pattern.chain;

public interface ProcessHandler {

    boolean handlerMessage(Object msg);

    boolean isFit(Object msg);
}
