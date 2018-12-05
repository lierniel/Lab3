package com.stepan;

import com.stepan.creatures.Baby;
import com.stepan.creatures.Carlson;
import com.stepan.en.Status;
import com.stepan.furniture.Window;
import com.stepan.inter.TellAboutMyself;
import com.stepan.nature.Sky;
import com.stepan.nature.Wind;

public class Lab3 {
    public static void main(String[] args) {
       new Window().tellAboutMyself();
        new Wind().AllToDo(new Sky(),new Baby(Status.STAYING),new Carlson(Status.FLYING));
    }
}
