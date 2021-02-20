package cn.lemongo97.pattern.command;

public class RequirementGroup extends Group{
    @Override
    protected void find() {
        System.out.println("找到需求组...");
    }

    @Override
    protected void add() {
        System.out.println("要求增加一项需求...");
    }

    @Override
    protected void delete() {
        System.out.println("要求删除一项需求...");
    }

    @Override
    protected void modify() {
        System.out.println("要求修改一项需求...");
    }

    @Override
    protected void plan() {
        System.out.println("要求需求变更计划...");
    }
}
