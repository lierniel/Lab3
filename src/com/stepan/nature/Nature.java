package com.stepan.nature;

import com.stepan.inter.Do;
import com.stepan.inter.TellAboutMyself;

abstract public class Nature implements Do, TellAboutMyself {
    private final String name;
    private final String feel;
     protected Nature(String name, String feel){
         this.name=name;
         this.feel=feel;
     }
     public String getName(){
         return this.name;
     }
     public String getFeel(){
         return this.feel;
     }
    @Override
     public void tellAboutMyself() {
        System.out.println("Это" + " " + this.name + " " + this.feel);
    }
     @Override
     public boolean equals(Object obj){
         if (obj == null){
             return false;
         }
         if(obj instanceof Nature){
             if(this.name.equals(((Nature) obj).name) && this.getClass()==obj.getClass()){
                 return true;
             }
         }
         return false;
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
     public String toString(){
         return this.getClass() + " " + this.name+" "+ this.feel;
     }
}
