package com.stepan.creatures;

import com.stepan.en.Status;

public class Dog extends Creatures {
    public Dog(){
        super("Щенок");
    }
    public Dog(String name){
        super(name);
    }
    public Dog(Status status){
        super("Щенок",status);
    }
    public Dog(String name,Status status){
        super(name,status);
    }
    @Override
    protected String makeSound(){
        return "*Гав-гав*";
    }
    @Override
    public void toDo(){
        this.tellAboutMyself();
        this.sound();
    }
}
