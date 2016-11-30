package com.company;

/**
 * Created by pivekk on 30.11.2016.
 */
public class CPerson {
    private String Sname;
    private String Ssurname;

    public CPerson(String name,String surname){
        this.Sname=name;
        this.Ssurname=surname;
    }
    public String toString(){
        return this.Sname+" "+this.Ssurname;
    }
}
