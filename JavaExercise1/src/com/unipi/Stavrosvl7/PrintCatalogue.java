package com.unipi.Stavrosvl7;

public class PrintCatalogue implements Option {
    private final Catalogue catalogue;

    public PrintCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    @Override
    public String Title() {
        return "Εκτύπωση καταλόγου";
    }

    @Override
    public boolean Action() {
        this.catalogue.PrintList();
        return false;
    }

}
