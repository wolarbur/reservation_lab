package com.example.lab1;

public class Reservation {
    private String roomName;
    private int roomSize;
    private String isBook;

    //Default constructor
    public Reservation(){
        roomName = "";
        roomSize = 0;
        isBook = "no";
    }
    //Constructor
    public Reservation(String n, int s, String j){
        this.roomName = n;
        this.roomSize = s;
        this.isBook = j;
    }

    //Getters
    public String getName(){
        return roomName;
    }
    public int getRoomSize(){
        return roomSize;
    }
    public String getBookStatus(){
        return isBook;
    }

    //Setters
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }
    public void setBookStatus(String isBook) {
        this.isBook = isBook;
    }

    public void addReservation(){

    }
}




