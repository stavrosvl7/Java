package com.unipi.Stavrosvl7;

import java.util.Arrays;

class Main {


    public static void main(String[] args) {

        Menu menu = new Menu();
        Menu subMenu = new Menu();

        Catalogue catalogue = new Catalogue();

        PrintCatalogue print = new PrintCatalogue(catalogue);
        AddContact addContact = new AddContact(catalogue);
        SearchByName searchByName = new SearchByName(catalogue);
        SearchByPhone searchByPhone = new SearchByPhone(catalogue);
        EditByName editByName = new EditByName(subMenu);
        RemoveByName removeByName = new RemoveByName(catalogue);
        SaveToFile saveToFile = new SaveToFile(catalogue);
        LoadFromFile loadFromFile = new LoadFromFile(catalogue);
        Exit exit = new Exit();

        EditName editName = new EditName(catalogue);
        EditPhone editPhone = new EditPhone(catalogue);
        EditEmail editEmail = new EditEmail(catalogue);
        EditAddress editAddress = new EditAddress(catalogue);

        menu.AddToOptionList(Arrays.asList(print,addContact,searchByName,searchByPhone,editByName,removeByName,saveToFile,loadFromFile,exit));
        subMenu.AddToOptionList(Arrays.asList(editName,editPhone,editEmail,editAddress,exit));

        menu.PrintStart();
        menu.PrintMenu();
    }
}
