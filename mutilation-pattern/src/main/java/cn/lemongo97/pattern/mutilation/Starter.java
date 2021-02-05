package cn.lemongo97.pattern.mutilation;

public class Starter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MutilationInstance instance = MutilationInstance.getInstance();
            instance.doAction();
        }
    }
}
