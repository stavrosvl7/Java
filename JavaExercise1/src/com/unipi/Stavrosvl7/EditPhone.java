package com.unipi.Stavrosvl7;

import java.util.Scanner;

public class EditPhone implements Option {
    private final Catalogue catalogue;

    public EditPhone(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Επεξεργασία τηλέφώνου επαφής";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα προς αναζήτηση");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        catalogue.EditPhone(name);
        return true;
    }

}
