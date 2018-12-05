package com.stepan.creatures;

import com.stepan.en.Status;

public class Baby extends Creatures {
    public Baby(){
        super("Малыш");
    }
    public Baby(String name){
        super(name);
    }
    public Baby(Status status){
        super("Малыш",status);
    }
    public Baby(String name,Status status){
        super(name,status);
    }
    @Override
    protected String makeSound(){
        return "*тяжелый вздох*";
    }
    @Override
    public void toDo(){
        this.tellAboutMyself();
        this.setStatus(Status.BLOCKING);
        this.see();
        this.think();
        this.sound();
        this.hear();
    }
    public void think(){
        System.out.println(this.getName()+": *предаставляет*\n");
        System.out.println("**");
        Dog dog = new Dog(Status.LYING);
        dog.toDo();
        UnknownBoy boy = new UnknownBoy(Status.SITTING);
        boy.toDo();
        System.out.println("**\n");
    }
    public void see(){
        System.out.println(this.getName()+ " смотрит в окно");
    }
    public void hear(){
        System.out.println(this.getName()+" что-то слышит");
    }
}