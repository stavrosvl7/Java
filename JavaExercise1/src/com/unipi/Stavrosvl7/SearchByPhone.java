package com.unipi.Stavrosvl7;

import java.util.Scanner;

public class SearchByPhone implements Option {
    private final Catalogue catalogue;
    private final Scanner scanner = new Scanner(System.in);

    public SearchByPhone(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Αναζήτηση επαφής με βάση το τηλέφωνο";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε τηλέφωνο προς αναζήτηση");
        long phone = scanner.nextLong();
        catalogue.SearchByTelephone(phone);
        return false;
    }
}
