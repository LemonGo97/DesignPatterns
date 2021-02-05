package cn.lemongo97.pattern.factory;

public enum CatEnum {

    BlackFemaleCat("cn.lemongo97.pattern.factory.BlackFemaleCat"),
    BlackMaleCat("cn.lemongo97.pattern.factory.BlackMaleCat"),
    OrangeFemaleCat("cn.lemongo97.pattern.factory.OrangeFemaleCat"),
    OrangeMaleCat("cn.lemongo97.pattern.factory.OrangeMaleCat"),
    TabbyFemaleCat("cn.lemongo97.pattern.factory.TabbyFemaleCat"),
    TabbyMaleCat("cn.lemongo97.pattern.factory.TabbyMaleCat"),
    WhiteFemaleCat("cn.lemongo97.pattern.factory.WhiteFemaleCat"),
    WhiteMaleCat("cn.lemongo97.pattern.factory.WhiteMaleCat");

    private String value = "";

    private CatEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
