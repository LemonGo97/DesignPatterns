package cn.lemongo97.pattern.adapter;

public class Starter {

    public static void main(String[] args) {
        IOurUser user = new OtherUserInfoAdapter();
        for (int i = 0; i < 11; i++) {
            System.out.println(user.toString());
        }
    }

}
