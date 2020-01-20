package com.unipi.Stavrosvl7;

import java.util.Scanner;

public class RemoveByName implements Option{
    private final Catalogue catalogue;
    private final Scanner scanner = new Scanner(System.in);

    public RemoveByName(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Διαγραφή επαφής βάση ονόματος";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα προς διαγραφή");
        String name = scanner.nextLine();
        catalogue.RemoveFromList(name);
        return false;
    }
}
