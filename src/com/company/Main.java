package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	CAllRooms rooms=new CAllRooms();
        CPerson jan=new CPerson("Jan","Kowalski");
        CPerson kuba=new CPerson("Kuba","Juarez");
        rooms.addRoom("Sala1",10,2016,11,30,10,0,2016,12,2,11,11,jan);
        rooms.addRoom("Sala2",50,2016,11,30,22,22,2017,1,2,11,11,jan);
        rooms.addRoom("Sala3",12);
        rooms.list();
        System.out.println();
        rooms.unrent(0);
        rooms.list();
        System.out.println();
        rooms.rent(kuba,2,new Date(2016-1900,12-1,29,10,10),new Date(2016-1900,12-1,31,10,0));
        rooms.list();
    }
}
