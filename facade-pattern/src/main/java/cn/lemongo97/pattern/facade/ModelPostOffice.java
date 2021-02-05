package cn.lemongo97.pattern.facade;

public class ModelPostOffice {

    private final Police police = new Police();

    public void sendLetter(String context, String address) throws Exception {
        LetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        police.checkLetter(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }

}
