package com.stepan.nature;

import com.stepan.en.Status;
import com.stepan.en.TimeOfDay;

public class Stars extends SkyThings {
    public Stars(){super("Звезды","бледные", TimeOfDay.EVENING, true);}
    public Stars(String name, String feel, TimeOfDay timeOfDay){super(name,feel,timeOfDay,true);}
    public Stars(String name,String feel, TimeOfDay timeOfDay, boolean visibleNow){super(name,feel,timeOfDay,visibleNow); }
    @Override
    public void toDo(){
        System.out.println(this.getName()+" блестят");
    }
}
