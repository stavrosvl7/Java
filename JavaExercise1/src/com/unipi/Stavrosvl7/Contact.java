package com.unipi.Stavrosvl7;

import java.io.Serializable;

class Contact implements Serializable {
    private String name;
    private long telephone;
    private String email;
    private String address;

    Contact(String name, long telephone, String email, String address){
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetTelephone(long telephone){
        this.telephone = telephone;
    }

    public void SetEmail(String email){
        this.email = email;
    }

    public void SetAddress(String address){
        this.address = address;
    }

    public String GetName(){
        return this.name;
    }

    public long GetTelephone(){
        return this.telephone;
    }

    public String GetEmail(){
        return this.email;
    }

    public String GetAddress(){
        return this.address;
    }

}
