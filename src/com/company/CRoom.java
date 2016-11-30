package com.company;

import java.util.Date;

public class CRoom {
    private Date dateofStart;
    private Date dateofEnd;
    private String sName;
    private int iSize;
    private CPerson person;
public CRoom (String name,int size){
    this.sName=name;
    this.iSize=size;
    this.dateofEnd=null;
    this.dateofStart=null;
    this.person=null;
}
public CRoom(String name,int size,Date start,Date end){
    this.sName=name;
    this.iSize=size;
    this.dateofStart=start;
    this.dateofEnd=end;
}

@SuppressWarnings("deprecation")
public CRoom(String name, int size, int startYear, int startMonth, int startDay, int startHour, int startMinute, int endYear, int endMonth, int endDay, int endHour, int endMinute,CPerson person){
    this.sName=name;
    this.iSize=size;
    this.dateofStart=new Date(startYear-1900,startMonth-1,startDay,startHour,startMinute);
    this.dateofEnd=new Date(endYear-1900,endMonth-1,endDay,endHour,endMinute);
    this.person=person;
}

public String toString(){
   if(!(this.person==null)) return this.sName+" wielkosc: "+this.iSize + " Start rezerwacji "+dateofStart.toString()+" Koniec rezerwacji "+dateofEnd.toString() + " wlasciciel " + person.toString();
    else return this.sName+" wielkosc " + this.iSize +" wolna sala ";
}
public CPerson getPerson(){
    return this.person;
}
public boolean rent (CPerson person,Date start,Date end){
    if (!(this.person==null))return false;
    else this.person=person;
    this.dateofStart=start;
    this.dateofEnd=end;
    return true;
}
public void unrent (){
    this.person=null;
    this.dateofEnd=null;
    this.dateofStart=null;
}

}
