package cn.lemongo97.pattern.command;

public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.pageGroup.add();
        super.codeGroup.add();
        super.requirementGroup.plan();
    }
}
