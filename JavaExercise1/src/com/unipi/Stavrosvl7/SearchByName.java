package com.unipi.Stavrosvl7;

import java.util.Scanner;

public class SearchByName implements Option{
    private final Catalogue catalogue;
    private final Scanner scanner = new Scanner(System.in);

    public SearchByName(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Αναζήτηση επαφής με βάση το όνομα";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα προς αναζήτηση");
        String name = scanner.nextLine();
        catalogue.SearchByName(name);
        return false;
    }
}
