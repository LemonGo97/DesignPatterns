package cn.lemongo97.pattern.facade;

public class Police {
    public void checkLetter(LetterProcess letterProcess) throws Exception {
        Letter letter = letterProcess.getLetter();
        if ("deny".equals(letter.getAddress())){
            throw new Exception("此邮件不允许发出！！");
        }
    }
}
