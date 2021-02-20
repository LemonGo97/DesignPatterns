package cn.lemongo97.pattern.command;

public class CodeGroup extends Group{
    @Override
    protected void find() {
        System.out.println("找到代码组...");
    }

    @Override
    protected void add() {
        System.out.println("要求增加一项功能...");
    }

    @Override
    protected void delete() {
        System.out.println("要求删除一项功能...");
    }

    @Override
    protected void modify() {
        System.out.println("要求修改一项功能...");
    }

    @Override
    protected void plan() {
        System.out.println("要求代码变更计划...");
    }
}
