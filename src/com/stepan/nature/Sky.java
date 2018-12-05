package com.stepan.nature;

import com.stepan.en.Status;
import com.stepan.en.TimeOfDay;

public class Sky extends SkyThings{
    public Sky(){
        super("Небо","чистое, весеннее",TimeOfDay.EVENING, true);
    }
    public Sky(String name, String feel, TimeOfDay timeOfDay){
        super(name,feel,timeOfDay,true);
    }
    public Sky(String name,String feel, TimeOfDay timeOfDay, boolean visibleNow){
        super(name,feel,timeOfDay,visibleNow);
    }
    public void show(SkyThings skyThings){
        try{
            if (this.equals(skyThings)){
                throw new RuntimeException(this.getName()+ " не может показать "+ skyThings.getName()+". Измените входные параметры");
            }
            System.out.println(skyThings.getName() + " на небе");

        }catch(RuntimeException e){
            e.printStackTrace();
            System.exit(2);
        }

    }
    @Override
    public void toDo(){
        this.tellAboutMyself();
        Stars stars = new Stars();
        stars.tellAboutMyself();
        this.show(stars);
        stars.toDo();
    }
}
