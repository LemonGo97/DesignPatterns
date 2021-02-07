package cn.lemongo97.pattern.adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class OtherUserInfo implements IOtherUser{
    private Map<String, String> userInfo = new HashMap<String,String>(){
        {
            this.put("id","11");
            this.put("name","张三");
            this.put("age","18");
        }
    };
    private Map<String, String> homeInfo = new HashMap<String,String>(){
        {
            this.put("telephone","13344556677");
        }
    };
    private Map<String, String> workInfo = new HashMap<String,String>(){
        {
            this.put("idCard","1532648562");
        }
    };

    @Override
    public Map<String, String> getUserInfo() {
        return userInfo;
    }

    @Override
    public void setUserInfo(Map<String, String> userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public Map<String, String> getHomeInfo() {
        return homeInfo;
    }

    @Override
    public void setHomeInfo(Map<String, String> homeInfo) {
        this.homeInfo = homeInfo;
    }

    @Override
    public Map<String, String> getWorkInfo() {
        return workInfo;
    }

    @Override
    public void setWorkInfo(Map<String, String> workInfo) {
        this.workInfo = workInfo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OtherUserInfo.class.getSimpleName() + "[", "]")
                .add("userInfo=" + userInfo)
                .add("homeInfo=" + homeInfo)
                .add("workInfo=" + workInfo)
                .toString();
    }
}
