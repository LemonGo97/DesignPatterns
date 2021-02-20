package cn.lemongo97.pattern.command;

public abstract class Group {
    protected abstract void find();
    protected abstract void add();
    protected abstract void delete();
    protected abstract void modify();
    protected abstract void plan();
}
