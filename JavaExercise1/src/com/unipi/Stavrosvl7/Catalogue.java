package com.unipi.Stavrosvl7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

class Catalogue{
    private final List<Contact> contacts = new ArrayList<>();
    private boolean cont = true;
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void AddToList(Contact contact) {
        contacts.add(contact);
    }

    public void LoadFromFile(File filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (cont) {
                try {
                    Object obj = ois.readObject();
                    if (obj != null) {
                        contacts.add((Contact) obj);
                    } else {
                        cont = false;
                    }
                } catch (EOFException eof) {
                    System.out.println("Το αρχείο φορτώθηκε επιτυχώς");
                    cont = false;
                }
            }
            cont = true;
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Το αρχείο δεν βρέθηκε");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void SaveToFile(File filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < contacts.size(); i++) {
                oos.writeObject(contacts.get(i));
            }
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void RemoveFromList(String name) {
        if (contacts.size() == 0) {
            System.out.println("Ο κατάλογος είναι άδειος δεν υπάρχει κάτι για διαγραφή");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).GetName().equals(name)) {
                contacts.remove(i);
                System.out.println(name + " σβήστηκε επιτυχώς");
                return;
            }
        }
        System.out.println(name + " δεν υπάρχει στον κατάλογο");
    }

    public void PrintList() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + 1 + ". " +  contacts.get(i).GetName() + " " + contacts.get(i).GetTelephone() + " " + contacts.get(i).GetEmail() + " " + contacts.get(i).GetAddress());
        }
    }

    public void SearchByName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).GetName().equals(name)) {
                Contact c = contacts.get(i);
                System.out.println("Το όνομα " + name + " υπάρχει στον κατάλογο");
                System.out.println("Τα στοιχεία του ειναι :  " + c.GetName() + " " + c.GetTelephone() + " " + c.GetEmail() + " " + c.GetAddress());
                break;
            }
            System.out.println("Το όνομα " + name + " δεν υπάρχει στον κατάλογο");
        }
    }

    public void SearchByTelephone(long telephone) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).GetTelephone() == telephone) {
                Contact c = contacts.get(i);
                System.out.println("Το τηλέφωνο " + telephone + " υπάρχει στον κατάλογο");
                System.out.println("Τα στοιχεία του ειναι :  " + c.GetName() + " " + c.GetTelephone() + " " + c.GetEmail() + " " + c.GetAddress());
                break;
            }
            System.out.println("Το τηλέφωνο " + telephone + " δεν υπάρχει στον κατάλογο");
        }
    }

    public void EditName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).GetName().equals(name)) {
                System.out.println("Γράψτε το νέο όνομα της επαφής");
                Scanner scanner = new Scanner(System.in);
                String scname = scanner.nextLine();
                contacts.get(i).SetName(scname);
                return;
            }
        }
        System.out.println("Το όνομα " + name + " δεν υπάρχει στον κατάλογο");
    }

    public void EditPhone(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).GetName().equals(name)) {
                System.out.println("Γράψτε το νέο τηλέφωνο της επαφής");
                contacts.get(i).SetTelephone(TestTelephone());
                return;
            }
        }
        System.out.println("Το όνομα " + name + " δεν υπάρχει στον κατάλογο");
    }

    public void EditEmail(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).GetName().equals(name)) {
                System.out.println("Γράψτε το νέο email της επαφής");
                Scanner scanner = new Scanner(System.in);
                String email = scanner.nextLine();
                contacts.get(i).SetEmail(email);
                return;
            }
        }
        System.out.println("Το όνομα " + name + " δεν υπάρχει στον κατάλογο");
    }

    public void EditAddress(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).GetName().equals(name)) {
                System.out.println("Γράψτε τη νέα διεύθυνση της επαφής");
                Scanner scanner = new Scanner(System.in);
                String address = scanner.nextLine();
                contacts.get(i).SetAddress(address);
                return;
            }
        }
        System.out.println("Το όνομα " + name + " δεν υπάρχει στον κατάλογο");
    }

    public long TestTelephone() {
        long phonelong;
        while (true) {
            String phone;
            try {
                phone = br.readLine();
                if (phone.length() == 10) {
                    phonelong = Long.parseLong(phone);
                    return phonelong;
                }
            } catch (Exception e) {

            }
            System.out.println("Γράψτε ένα σωστό τηλέφωνο με 10 ψηφία");
        }
    }
}