package cn.lemongo97.pattern.adapter;

public interface IOurUser {

    void setId(Integer id);

    Integer getId();

    void setName(String name);

    String getName();

    void setAge(Integer age);

    Integer getAge();

    void setTelephone(String telephone);

    String getTelephone();

    void setIdCard(String idCard);

    String getIdCard();

    String toString();
}
