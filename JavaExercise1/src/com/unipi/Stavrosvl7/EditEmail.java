package com.unipi.Stavrosvl7;

import java.util.Scanner;

public class EditEmail implements Option{
    private final Catalogue catalogue;

    public EditEmail(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Επεξεργασία email επαφής";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα προς αναζήτηση");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        catalogue.EditEmail(name);
        return true;
    }
}
