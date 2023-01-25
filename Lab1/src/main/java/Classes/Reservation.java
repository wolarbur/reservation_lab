package Classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Reservation {
    private String roomName;
    private String isBooked;
    private int partySize;
    private String name;




    //Default constructor
    public Reservation(){
    }
    //Constructor
    public Reservation(String n, String j, int s){
        this.roomName = n;
        this.isBooked = j;
        this.partySize = s;
    }
    //Getters
    public String getName(){
        return roomName;
    }
    public String getBookStatus(){
        return isBooked;
    }
    public int getRoomSize(){
        return partySize;
    }
    //Setters
    public void setRoomName(String name) {
        this.roomName = roomName;
    }
    public void setBookStatus(String bookStatus) {this.isBooked = bookStatus;}
    public void setRoomSize(int roomSize) {
        this.partySize = roomSize;
    }


    public Reservation addReservation(){
        Reservation x = new Reservation("Rith Douche","Yes",2);
        return x;
    }
}




