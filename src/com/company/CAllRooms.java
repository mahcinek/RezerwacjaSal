package com.company;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CAllRooms {
    private ArrayList<CRoom> list;
    public CAllRooms(){
        list=new ArrayList<CRoom>();
    }

    public void addRoom(CRoom room){
        list.add(room);
    }
    public void addRoom(String name, int size, Date dateofStart, Date dateofEnd){
        list.add(new CRoom(name,size,dateofStart,dateofEnd));
    }
    public void addRoom(String name,int size){
        list.add(new CRoom(name,size));
    }
    public void addRoom(String name, int size, int startYear, int startMonth, int startDay, int startHour, int startMinute, int endYear, int endMonth, int endDay, int endHour, int endMinute, CPerson person){
        list.add(new CRoom( name,  size,  startYear,  startMonth,  startDay,  startHour,  startMinute,  endYear,  endMonth,  endDay,  endHour,  endMinute,person));
    }
    public void list()
    {
        for (CRoom a:list)
        {
            System.out.println(a.toString());
        }
    }
    public CRoom delete(int index){
        return list.remove(index);
    }
    public int findindexEmpty (){
        for (int i = 0;i<list.size();i++)
        {
            if(list.get(i).getPerson().equals(null)) return i;
        }
        return -1;}

     public boolean rent (CPerson person, int index, Date start,Date end){
        if (list.get(index).getPerson()!=null) return false;
        else {
            list.get(index).rent(person,start,end);
        }
         return false;
     }
     public void unrent (int index){
         list.get(index).unrent();
     }

    public CRoom get(int index){
        return list.get(index);
    }

}
