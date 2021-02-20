package cn.lemongo97.pattern.command;

public class Starter {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("--------------增加一项需求--------------");
        Command command = new AddRequirementCommand();

        invoker.setCommand(command).action();
    }

}
