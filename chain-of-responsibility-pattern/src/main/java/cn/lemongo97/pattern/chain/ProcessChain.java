package cn.lemongo97.pattern.chain;

import java.util.ArrayList;
import java.util.List;

public class ProcessChain {
    private final List<ProcessHandler> chains = new ArrayList<>();

    public ProcessChain addChainFirst(ProcessHandler handler){
        chains.add(0, handler);
        return this;
    }

    public ProcessChain addChainLast(ProcessHandler handler){
        chains.add(handler);
        return this;
    }

    public void process(Object msg){
        for (ProcessHandler chain : chains) {
            if (!chain.isFit(msg)){
                continue;
            }
            boolean isOk = chain.handlerMessage(msg);
            if (isOk){
                break;
            }
        }
    }

}
