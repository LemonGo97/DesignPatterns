package cn.lemongo97.pattern.mutilation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MutilationInstance {

    private static int maxNumOfInstance = 2;

    private static List<MutilationInstance> instanceList = new ArrayList<>(maxNumOfInstance);
    private static List<String> instanceInfoList = new ArrayList<>(maxNumOfInstance);

    private static final MutilationInstance instance = new MutilationInstance();

    private static int index = 0;

    static {
        for (int i = 0; i < maxNumOfInstance; i++) {
            instanceList.add(new MutilationInstance("第 " + (i + 1) + " 个实例"));
        }
    }

    private MutilationInstance() {
    }

    private MutilationInstance(String info) {
        instanceInfoList.add(info);
    }

    public synchronized static MutilationInstance getInstance() {
        index = new Random().nextInt(maxNumOfInstance);
        return instanceList.get(index);
    }

    public void doAction() {
        System.out.println(instanceInfoList.get(index));
    }

}
