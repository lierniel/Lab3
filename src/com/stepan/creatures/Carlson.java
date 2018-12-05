package com.stepan.creatures;

import com.stepan.en.Status;

public class Carlson extends Creatures {
    public Carlson(){
        super("Карлсон");
    }
    public Carlson(String name){
        super(name);
    }
    public Carlson(Status status){
        super("Карлсон",status);
    }
    public Carlson(String name, Status status){
        super(name,status);
    }
    @Override
    protected String makeSound(){
        return "*жжжжЖЖЖЖжжжж*";
    }
    @Override
    public void toDo(){
        this.tellAboutMyself();
        this.sound();
        this.live();
    }
    public void live(){
        System.out.println(this.getName()+" живет на крыше");
    }
}
