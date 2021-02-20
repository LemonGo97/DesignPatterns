package cn.lemongo97.pattern.decorator;

public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore() {
        System.out.println("这次考试最高分 语文 75 数学 78 自然 80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
