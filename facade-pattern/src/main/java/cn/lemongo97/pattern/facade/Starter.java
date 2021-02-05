package cn.lemongo97.pattern.facade;

public class Starter {

    public static void main(String[] args) throws Exception {
        ModelPostOffice postOffice = new ModelPostOffice();

        String address = "No. 123456";
        String context = "this is a letter for you ！";

        postOffice.sendLetter(context, address);
    }

}
