package com.stepan.furniture;

import com.stepan.inter.TellAboutMyself;

abstract public class Furniture implements TellAboutMyself {
    private final String name;
    private final String furstatus;
    public Furniture(String name, String furstatus){
        this.name=name;
        this.furstatus=furstatus;
    }
    public String getName(){
        return this.name;
    }
    public String getFurstatus(){
        return this.furstatus;
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
        if(obj instanceof Furniture){
            if(this.name.equals(((Furniture) obj).name) && this.getClass()==obj.getClass()){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return this.getClass() + " " + this.name+" "+ this.furstatus;
    }
    @Override
    public void tellAboutMyself(){
        System.out.println("Это " + this.name + " " + this.furstatus);
    }
}
