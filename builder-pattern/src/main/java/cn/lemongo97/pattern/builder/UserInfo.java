package cn.lemongo97.pattern.builder;

import java.util.StringJoiner;

public class UserInfo {
    private Integer id;
    private String name;
    private String sex;
    private String telephone;
    private String idCard;
    private String email;

    private UserInfo(UserInfoBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
        this.telephone = builder.telephone;
        this.idCard = builder.idCard;
        this.email = builder.email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", UserInfo.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("sex='" + sex + "'")
                .add("telephone='" + telephone + "'")
                .add("idCard='" + idCard + "'")
                .add("email='" + email + "'")
                .toString();
    }

    public static class UserInfoBuilder{
        private Integer id;
        private String name;
        private String sex;
        private String telephone;
        private String idCard;
        private String email;

        public UserInfoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public UserInfoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserInfoBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public UserInfoBuilder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public UserInfoBuilder idCard(String idCard) {
            this.idCard = idCard;
            return this;
        }

        public UserInfoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserInfo build(){
            return new UserInfo(this);
        }
    }

}
