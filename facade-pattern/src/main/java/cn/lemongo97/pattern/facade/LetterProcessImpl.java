package cn.lemongo97.pattern.facade;

public class LetterProcessImpl implements LetterProcess {

    private final Letter letter = new Letter();

    @Override
    public void writeContext(String context) {
        System.out.println("step1: 写信中：\n" + context);
        letter.setContext(context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("step2: 填写信封上的地址：\n" + address);
        letter.setAddress(address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("step3: 将信件装入信封。");
    }

    @Override
    public void sendLetter() {
        System.out.println("step4: 发送邮件！");
    }

    @Override
    public Letter getLetter() {
        return this.letter;
    }

}
