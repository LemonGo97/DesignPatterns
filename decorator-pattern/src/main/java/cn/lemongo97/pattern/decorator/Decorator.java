package cn.lemongo97.pattern.decorator;

public abstract class Decorator implements ISchoolReport {

    protected ISchoolReport schoolReport;

    public Decorator(ISchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
