package com.unipi.Stavrosvl7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Menu {

    private final List<Option> options = new ArrayList<>();

    public void AddToOptionList(List<Option> option){
        options.addAll(option);
    }

    public void PrintStart(){
        System.out.println(" -------------Εφαρμογή AddressBook--------------");
        System.out.println("!Παρακαλώ επιλέξτε απο το παρακάτω menu επιλογών!");
        System.out.println(" ----------------------------------------------- ");
    }

    public void PrintMenu(){
        /* η συνάρτηση που εκτυπωνει το menu η οποία λειτουργεί αναδρομικά άν είναι τα δοθέντα στοιχεια σωστά ,
           αλλά δεν λειτουργεί αναδρομικά στην περίπτωση επεξεργασίας επαφής και στην περιπτωση της exit για να μπορώ να μπω απο το menu στο submenu και αντιστροφα ,
           και αντιστοιχα στις εξοδους τους . Σε αυτες τις περιπτωσεις επιστρέφει είτε για να παρει νεο menu (το submenu), είτε για να βγεί απο to submenu, ειτε για να κλεισει το προγραμμα. */
        for(int i=0;i<options.size();i++){
            System.out.println(i+1 + " " +options.get(i).Title());
        }

        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            if(n>=1 && n<=options.size()) {
                if (options.get(n - 1).Action()) {
                    return;
                }
            }
            else {
                System.out.println("Πρέπει να βάλετε έναν ακέραιο απο " + 1 + " εως " + options.size() + " όπως φαίνεται στο menu!!");
            }
        }
        else{
            System.out.println("Πρέπει να βάλετε έναν ακέραιο απο " + 1 + " εως " + options.size() + " όπως φαίνεται στο menu!!");
        }
        PrintMenu();
    }
}
