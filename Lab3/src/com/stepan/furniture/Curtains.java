package com.stepan.furniture;

public class Curtains extends Furniture {
    public Curtains(){
        super("Занавески","раскачиваются");
    }
    private Curtains(String name, String furstatus){
        super(name,furstatus);
    }
}
