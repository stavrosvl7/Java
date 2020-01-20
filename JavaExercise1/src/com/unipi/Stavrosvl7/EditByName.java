package com.unipi.Stavrosvl7;

public class EditByName implements Option{
    private final Menu menu;

    public EditByName(Menu menu){
        this.menu = menu;
    }

    @Override
    public String Title() {
        return "Επεξεργασία επαφής με βάση το όνομα";
    }

    @Override
    public boolean Action() {
        menu.PrintMenu();
        return false;
    }
}
