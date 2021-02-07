package cn.lemongo97.pattern.adapter;

import java.util.Map;

public interface IOtherUser {
    Map<String, String> getUserInfo();

    void setUserInfo(Map<String, String> userInfo);

    Map<String, String> getHomeInfo();

    void setHomeInfo(Map<String, String> homeInfo);

    Map<String, String> getWorkInfo();

    void setWorkInfo(Map<String, String> workInfo);
}
