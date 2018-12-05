package com.stepan.inter;

public interface Do extends TellAboutMyself {
    void toDo();
    default void AllToDo(Do ... todoes){
        this.toDo();
        for(Do toDo:todoes){
            toDo.toDo();
        }
    }
}
