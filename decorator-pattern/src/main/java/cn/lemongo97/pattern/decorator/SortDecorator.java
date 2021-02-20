package cn.lemongo97.pattern.decorator;

public class SortDecorator extends Decorator{
    public SortDecorator(ISchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportSort() {
        System.out.println("我的排名 38...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
