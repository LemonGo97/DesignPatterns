package cn.lemongo97.pattern.visitor;

public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    int getTotalSalary();
}
