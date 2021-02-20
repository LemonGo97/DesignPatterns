package cn.lemongo97.pattern.command;

public class Invoker {
    private Command command;

    public Invoker setCommand(Command command){
        this.command = command;
        return this;
    }

    public void action(){
        this.command.execute();
    }
}
