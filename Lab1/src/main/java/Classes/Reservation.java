package Classes;

public class Reservation {
    private String roomName;
    private String isBooked;
    private int roomSize;


    //Default constructor
    public Reservation(){
    }
    //Constructor
    public Reservation(String n, String j, int s){
        this.roomName = n;
        this.isBooked = j;
        this.roomSize = s;
    }
    //Getters
    public String getName(){
        return roomName;
    }
    public String getBookStatus(){
        return isBooked;
    }
    public int getRoomSize(){
        return roomSize;
    }
    //Setters
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public void setBookStatus(String isBook) {
        this.isBooked = isBook;
    }
    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }


    public void addReservation(){


    }
}




