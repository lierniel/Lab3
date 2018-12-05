package com.stepan.nature;

import com.stepan.en.TimeOfDay;

abstract public class SkyThings extends Nature{
    private boolean visibleNow;
    private TimeOfDay timeOfDay;
    public SkyThings(String name,String feel,TimeOfDay timeOfDay,boolean visibleNow){
        super(name,feel);
        this.timeOfDay=timeOfDay;
        this.visibleNow=visibleNow;
    }

    public boolean isVisibleNow(){
        return this.visibleNow;
    }
    public void setVisibleNow(Boolean visibleNow){
        this.visibleNow=visibleNow;
    }
    public TimeOfDay getTimeOfDay(){
        return this.timeOfDay;
    }

    public void setTimeOfDay(TimeOfDay timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
    @Override
    public void tellAboutMyself(){
        System.out.println("Это " + this.getName() + " " + this.getFeel()+ ", "+this.timeOfDay.sayTimeOfDay()+". Сейчас " +(this.visibleNow==true ? "можно":"нельзя") +" увидеть");
    }

}
