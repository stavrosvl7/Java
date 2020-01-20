package com.unipi.Stavrosvl7;

public class Exit implements Option{

    @Override
    public String Title() {
        return "Έξοδος";
    }

    @Override
    public boolean Action() {
        return true;
    }
}
