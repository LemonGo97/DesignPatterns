package cn.lemongo97.pattern.builder;

public class Starter {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo.UserInfoBuilder().id(1).name("张三").sex("man").telephone("13344445566").idCard("12345646546").email("123654789@123.com").build();
        System.out.println(userInfo);
    }

}
