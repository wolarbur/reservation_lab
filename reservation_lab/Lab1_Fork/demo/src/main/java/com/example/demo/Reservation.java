package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reservation {
    private String name, pNum;
    private int roomNum, nNum;
    Boolean[] roomAv = {true,true,true,true,true,true,true,true,true};
    private String roomType;

    public Reservation(String name, String p, String r)
    {
        this.name = name;
        this.pNum = p;
        this.roomType = r;
    }
    public Reservation(String name, String pNum, String roomType,int roomNum)
    {
        this.name = name;
        this.pNum = pNum;
        this.roomType = roomType;
        this.roomNum = roomNum;
    }
    public boolean checkAvailablity()

    {
        for (int i = 0; i < 10 ; i++)
        {
            if(roomNum == i && roomAv[i]==true)
            {
                System.out.println("The Room is available");
                return true;
            }
        }
        System.out.println("The Room is unavailable");
        return false;
    }
    public long calulcateNights(String d1, String d2) throws ParseException {
        long night;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = sdf.parse(d1);
        Date date2 = sdf.parse(d2);
        long difference_In_Time = date2.getTime()- date1.getTime();

        night = (difference_In_Time
            / (1000 * 60 * 60 * 24))
            % 365;
        return night;
    }
    //public void addReservation()
    {
        {
            Reservation x = new Reservation(name, pNum, roomType, roomNum);
        }
    }

}
