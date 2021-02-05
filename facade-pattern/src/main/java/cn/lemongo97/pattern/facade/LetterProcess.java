package cn.lemongo97.pattern.facade;

public interface LetterProcess {

    /**
     * 写信
     * @param context 信件内容
     */
    void writeContext(String context);

    /**
     * 写信封
     * @param address 邮件地址
     */
    void fillEnvelope(String address);

    /**
     * 将信件装入信封
     */
    void letterIntoEnvelope();

    /**
     * 发送邮件
     */
    void sendLetter();

    Letter getLetter();
}
