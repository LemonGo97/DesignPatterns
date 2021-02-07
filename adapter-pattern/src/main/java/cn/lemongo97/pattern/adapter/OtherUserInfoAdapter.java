package cn.lemongo97.pattern.adapter;

import java.util.Map;
import java.util.StringJoiner;

public class OtherUserInfoAdapter extends OtherUserInfo implements IOurUser {
    @Override
    public void setId(Integer id) {
        Map<String, String> userInfo = super.getUserInfo();
        userInfo.put("id", String.valueOf(id));
        super.setUserInfo(userInfo);
    }

    @Override
    public Integer getId() {
        return Integer.valueOf(super.getUserInfo().get("id"));
    }

    @Override
    public void setName(String name) {
        Map<String, String> userInfo = super.getUserInfo();
        userInfo.put("name", name);
        super.setUserInfo(userInfo);
    }

    @Override
    public String getName() {
        return super.getUserInfo().get("name");
    }

    @Override
    public void setAge(Integer age) {
        Map<String, String> userInfo = super.getUserInfo();
        userInfo.put("age", String.valueOf(age));
        super.setUserInfo(userInfo);
    }

    @Override
    public Integer getAge() {
        return Integer.valueOf(super.getUserInfo().get("age"));
    }

    @Override
    public void setTelephone(String telephone) {
        Map<String, String> homeInfo = super.getHomeInfo();
        homeInfo.put("telephone", telephone);
        super.setHomeInfo(homeInfo);
    }

    @Override
    public String getTelephone() {
        return super.getHomeInfo().get("telephone");
    }

    @Override
    public void setIdCard(String idCard) {
        Map<String, String> workInfo = super.getWorkInfo();
        workInfo.put("idCard", idCard);
        super.setHomeInfo(workInfo);
    }

    @Override
    public String getIdCard() {
        return super.getWorkInfo().get("idCard");
    }

    public String toString() {
        return new StringJoiner(", ", OurUserInfo.class.getSimpleName() + "[", "]")
                .add("id=" + this.getId())
                .add("name='" + this.getName() + "'")
                .add("age=" + this.getAge())
                .add("telephone='" + this.getTelephone() + "'")
                .add("idCard='" + this.getIdCard() + "'")
                .toString();
    }
}
