package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reservation {
    private String name;
    private String roomNum,pNum;
    private String isBooked;

    private long nights;

    private String date; // dates should be in this format "dd/mm/yyyy"
    private int[][] days = new int[365][8];




    //Default constructor
    public Reservation(){
    }
    //Constructor
    public Reservation(String name,String pNum,String date){
        this.name = name;
        this.isBooked = "No";
        this.date = date;
        this.pNum = pNum;
    }
    //Getters
    //public String getRoomNum(){
      //  return roomNum;
    //}
    public String getBookStatus(){
        return isBooked;
    }
    public String getpNum()
    {
        return pNum;
    }
    public String getName()
    {
        return name;
    }
    public String getDate(){
        return date;
    }

    //Setters
    public void setRoomName(String name) {
        this.name = name;
    }
    public void setBookStatus(String bookStatus) {this.isBooked = bookStatus;}

    //calculate nights between check-in and check-out
    public void calulcateNights(String d1, String d2) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = sdf.parse(d1);
        Date date2 = sdf.parse(d2);
        long difference_In_Time = date2.getTime()- date1.getTime();

        nights = (difference_In_Time
                / (1000 * 60 * 60 * 24))
                % 365;
    }


    //adding reservation method
    public Reservation addReservation(){
        Reservation x = new Reservation("Rith Douche","999 999 999","01/28/2023");
        return x;
    }
    public String toString(){
        return name + "\t"+pNum+"\t"+date;
    }
}




