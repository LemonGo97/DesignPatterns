package cn.lemongo97.pattern.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class AbstractCatFactory implements CatFactory {

    private static final Map<String,Cat> cats = new HashMap<>();

    @SuppressWarnings("rawtypes")
    protected Cat createCat(CatEnum catEnum){
        Cat cat = null;

        if (!catEnum.getValue().equals("")){
            try {
                cat = (Cat) Class.forName(catEnum.getValue()).newInstance();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return cat;
    }

}
