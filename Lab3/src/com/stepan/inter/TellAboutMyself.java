package com.stepan.inter;

public interface TellAboutMyself {
    void tellAboutMyself();
    default void tellAboutThemself(TellAboutMyself ... themself){
        this.tellAboutMyself();
        for(TellAboutMyself myself:themself){
            myself.tellAboutMyself();        }
    }
}
