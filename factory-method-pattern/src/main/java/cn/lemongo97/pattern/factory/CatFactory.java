package cn.lemongo97.pattern.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CatFactory {

    private static final Map<String,Cat> cats = new HashMap<>();

    @SuppressWarnings("rawtypes")
    public static Cat createCat(Class c){
        Cat cat = null;

        try{
            if (cats.containsKey(c.getSimpleName())){
                cat = cats.get(c.getSimpleName());
            }else {
                cat = (Cat) Class.forName(c.getName()).newInstance();
                cats.put(c.getSimpleName(),cat);
            }
        } catch (IllegalAccessException e) {
            System.err.println("必须指定猫的毛色！！");
        } catch (InstantiationException e) {
            System.err.println("猫的种类错误！！");
        } catch (ClassNotFoundException e) {
            System.err.println("该种类的猫找不到！！");
        }
        return cat;
    }


    @SuppressWarnings("rawtypes")
    public static Cat createCat(){
        List<Class> catKindList = ClassUtils.getAllClassByInterface(Cat.class);
        int rand = new Random().nextInt(catKindList.size());
        return createCat(catKindList.get(rand));
    }

}
