package com.unipi.Stavrosvl7;

import java.io.File;
import java.util.Scanner;

public class LoadFromFile implements Option {
    private final Catalogue catalogue;
    private final Scanner scanner = new Scanner(System.in);

    public LoadFromFile(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Φόρτωση από αρχείο";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα αρχείου");
        String filename = scanner.nextLine();
        File file = new File("C:\\Users\\stavros\\IdeaProjects\\JavaExercise1\\" + filename);
        catalogue.LoadFromFile(file);
        return false;
    }

}
