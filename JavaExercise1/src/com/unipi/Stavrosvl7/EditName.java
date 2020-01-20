package com.unipi.Stavrosvl7;

import java.util.Scanner;

public class EditName implements Option{
    private final Catalogue catalogue;
    private final Scanner scanner = new Scanner(System.in);

    public EditName(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Επεξεργασία ονόματος επαφής";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα προς αναζήτηση");
        String name = scanner.nextLine();
        catalogue.EditName(name);
        return true;
    }
}
