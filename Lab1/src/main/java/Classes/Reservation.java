package Classes;

public class Reservation {
    private String roomName;
    private String isBook;
    private int roomSize;


    //Default constructor
    public Reservation(){
    }
    //Constructor
    public Reservation(String n, int s, String j){
        this.roomName = n;
        this.isBook = j;
        this.roomSize = s;
    }
    //Getters
    public String getName(){
        return roomName;
    }
    public String getBookStatus(){
        return isBook;
    }
    public int getRoomSize(){
        return roomSize;
    }
    //Setters
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public void setBookStatus(String isBook) {
        this.isBook = isBook;
    }
    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }


    public void addReservation(){

    }
}




