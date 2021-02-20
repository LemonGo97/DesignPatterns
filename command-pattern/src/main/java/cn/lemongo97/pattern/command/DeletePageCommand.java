package cn.lemongo97.pattern.command;

public class DeletePageCommand extends Command{
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
