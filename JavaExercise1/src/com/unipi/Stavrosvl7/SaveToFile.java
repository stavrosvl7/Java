package com.unipi.Stavrosvl7;

import java.io.File;
import java.util.Scanner;

public class SaveToFile implements Option {
    private final Catalogue catalogue;
    private final Scanner scanner = new Scanner(System.in);

    public SaveToFile(Catalogue catalogue){
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Αποθήκευση σε αρχείο";
    }

    @Override
    public boolean Action() {
        System.out.println("Δώστε όνομα αρχείου");
        String filename = scanner.nextLine();
        File file = new File("C:\\Users\\stavros\\IdeaProjects\\JavaExercise1\\" + filename);
        try
        {
            file.createNewFile();
        } catch (Exception e){
            System.out.println("Ήταν αδύνατο να δημιουργηθεί το αρχείο");
            return false;
        }
        catalogue.SaveToFile(file);
        return false;
    }
}
