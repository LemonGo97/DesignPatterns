package cn.lemongo97.pattern.model;

public abstract class HummerModel {

    private boolean alarmFlag = true;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm(){
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag){
        this.alarmFlag = alarmFlag;
    }

}
