package cn.lemongo97.pattern.decorator;

public class Starter {

    public static void main(String[] args) {
        ISchoolReport myReport = new MySchoolReport();
        myReport = new HighScoreDecorator(myReport);
        myReport = new SortDecorator(myReport);
        myReport.report();
        myReport.sign("尼古拉斯·赵四");
    }

}
