package cn.lemongo97.pattern.chain;

public class Starter {

    public static void main(String[] args) {
        ProcessChain chain = new ProcessChain();
        chain.addChain(new BoolHandler()).addChain(new IntHandler()).addChain(new StringHandler());

        chain.process("abc");
        chain.process(true);
        chain.process(123);
    }

}
