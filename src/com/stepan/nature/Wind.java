package com.stepan.nature;

import com.stepan.creatures.Creatures;
import com.stepan.furniture.Curtains;
import com.stepan.furniture.Furniture;

public class Wind extends Nature {
    public Wind(){
        super("Ветер","свежий");
    }
    public Wind(String name, String feel){
        super(name,feel);
    }
    public void blow(Creatures creatures){
        System.out.println(this.getName() + " дует на " + creatures.getName());
    }
    public void blow(Furniture furniture){
        System.out.println(this.getName()+ " дует на " + furniture.getName());
    }
    @Override
    public void toDo(){
        this.tellAboutMyself();
        Curtains curtains=new Curtains();
        curtains.tellAboutMyself();
        this.blow(curtains);
    }
}
