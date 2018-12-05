package com.stepan.creatures;

import com.stepan.inter.Do;
import com.stepan.inter.TellAboutMyself;
import com.stepan.en.Status;

abstract public class Creatures implements Do, TellAboutMyself {
    private final String name;
    private Status status;
    abstract protected String makeSound();
    protected Creatures(String name){
        this.name=name;
    }
    protected Creatures(String name, Status status){
        this.name=name;
        this.status=status;
    }
    public void sound(){
        System.out.println(this.name +": "+this.makeSound());
    }
    public Status getStatus(){
        return this.status;
    }
    public void setStatus(Status status){
        this.status=status;
        System.out.println(this.name + " " + this.status.changeStatus());
    }
    public String getName(){
        return this.name;
    }
    @Override
    public void tellAboutMyself(){
        System.out.println("Это"+ " " + this.name);
        if (this.status!=null){
            System.out.println("В данный момент "+ this.name + " " + this.status.sayStatus());
        }
    }
    @Override
    public int hashCode(){
        int hash=0;
        for(int i=0;i<this.name.length();i++){
            hash+=(int)this.name.charAt(i)/(i+1);
        }
        for (int i=0;i<this.getClass().toString().length();i++){
            hash+=(int)this.getClass().toString().charAt(i)/(i+1);
        }
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj instanceof Creatures){
            if(this.name.equals(((Creatures) obj).name) && this.getClass()==obj.getClass()){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return this.getClass() + " " + this.name+" "+ (this.status == null ?"" :this.status.sayStatus());
    }
}
