package cn.lemongo97.pattern.command;

public class PageGroup extends Group{
    @Override
    protected void find() {
        System.out.println("找到美工组...");
    }

    @Override
    protected void add() {
        System.out.println("要求增加一个页面...");
    }

    @Override
    protected void delete() {
        System.out.println("要求删除一个页面...");
    }

    @Override
    protected void modify() {
        System.out.println("要求修改一个页面...");
    }

    @Override
    protected void plan() {
        System.out.println("要求页面变更计划...");
    }
}
