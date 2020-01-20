package com.unipi.Stavrosvl7;

import java.util.Scanner;

public class EditAddress implements Option{
    private final Catalogue catalogue;

    public EditAddress(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Επεξεργασία διεύθυνσης επαφής";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα προς αναζήτηση");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        catalogue.EditAddress(name);
        return true;
    }
}
