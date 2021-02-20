package cn.lemongo97.pattern.composite;

public abstract class Corp {

    private String name;

    private String position;

    private int salary = 0;

    private Corp parent;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return "名称：" + this.name + '\t' +
                "职位：" + this.position + '\t' +
                "薪水：" + this.salary + '\t';
    }

    public Corp getParent() {
        return parent;
    }

    protected void setParent(Corp parent) {
        this.parent = parent;
    }
}
