package com.stepan.creatures;

import com.stepan.en.Status;

public class UnknownBoy extends Creatures {
    public UnknownBoy(){
        super("Мальчик из воображения");
    }
    public UnknownBoy(String name){
        super (name);
    }
    public UnknownBoy(Status status){
        super("Мальчик из воображения",status);
    }
    public UnknownBoy(String name,Status status){
        super(name,status);
    }
    protected String makeSound(){
        return "\"Рики, ты чудесный пес!\"";
    }
    public void toDo(){
        this.tellAboutMyself();
        this.caress();
        this.sound();
    }
    public void caress(){
        System.out.println(this.getName()+ " гладит щенка");
    }
}
