package com.unipi.Stavrosvl7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddContact implements Option{
    private final Catalogue catalogue;
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public AddContact (Catalogue catalogue){
        this.catalogue = catalogue;
    }

    public String Title() {
        return "Προσθήκη επαφής";
    }

    public boolean Action() {
        System.out.println("Δώστε όνομα επαφής");
        String name = null;
        try{
            name = br.readLine();
        }
        catch(Exception e){
            System.out.println("Γράψτε ένα σωστό όνομα επαφής");
        }

        System.out.println("Δώστε τηλέφωνο");
        long phone = catalogue.TestTelephone();

        System.out.println("Δώστε email");
        String email = null;
        try{
            email = br.readLine();
        }
        catch(Exception e){
            System.out.println("Γράψτε ένα σωστό email");
        }


        System.out.println("Δώστε διεύθυνση");
        String address = null;
        try{
            address = br.readLine();
        }
        catch(Exception e){
            System.out.println("Γράψτε μία σωστή διεύθυνση");
        }

        Contact contact = new Contact(name,phone,email,address);

        this.catalogue.AddToList(contact);
        return false;
    }

}
