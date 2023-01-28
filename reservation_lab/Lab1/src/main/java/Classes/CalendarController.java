package Classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CalendarController extends Reservation implements Initializable{
    @FXML
    private DatePicker datePicker1;
    @FXML
    private String d1;
    @FXML
    private TextField name, phone;
    private TextField amount;

    @FXML
    private Label roomLabel; //available rooms
    @FXML

    //Table setup
    private  TableView<Reservation> dateTable;//main table
    @FXML
    private TableColumn<Reservation, String> nameColumn;
    @FXML
    private TableColumn<Reservation, String> statusColumn;
    @FXML
    private TableColumn<Reservation, String> dateColumn;

    ObservableList<Reservation> resList = FXCollections.observableArrayList(
            //new Reservation("John Doe", "478 927 772","01/09/2023"),
            //new Reservation("Alex Smith", "222 222 222","01/09/2023")
    );


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Table for displaying reservation info
        nameColumn.setCellValueFactory(new PropertyValueFactory<Reservation, String>("Name"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<Reservation, String>("BookStatus"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<Reservation, String>("date"));

        dateTable.setItems(resList);

    }
    public void addButton(ActionEvent event )
    {
        String n = name.getText();
        String pNum = phone.getText();
        Reservation y = new Reservation(n,pNum,d1);

        // if available it will add Reservation
        if(checkAvailability(d1)){
            y.setBookStatus("Yes");
            resList.add(y);
        }



        System.out.println(y);
        // remove any reservation with "No" for isBooked
        removeNonBooking();

        //Show Reservation
        showReservation();


    }
    // get check-in date and store it in d1
    public void getDate1(ActionEvent event){
        LocalDate myDate1 = datePicker1.getValue();
        d1 = myDate1.format(DateTimeFormatter.ofPattern("MM/DD/YYYY"));
    }
    public void outputToTextfile(){
        try {
            PrintWriter myWriter = new PrintWriter("Manifest.txt");
            for(int i = 0; i< resList.size();i++)
            {
                myWriter.write(String.valueOf(resList.get(i)));
                myWriter.close();

            }
            System.out.println("Successfully sent to textfile");
        } catch (FileNotFoundException e) {
            System.out.println("Unsuccessfully sent to textfile");
            throw new RuntimeException(e);
        }

    }
    // remove unsuccessfull bookings
    public void removeNonBooking (){
        for(int i = 0; i < resList.size();i++)
        {
            if (resList.get(i).getBookStatus().equals("No"))
            {
                resList.remove(i);
            }
        }
    }
    // check booking
    public boolean checkAvailability()
    {
        ArrayList<String> dates = new ArrayList<>();
        int count = 0;

        for(int i =0; i<resList.size();i++)
            dates.add(resList.get(i).getDate());

        for(int x = 0; x<dates.size();x++)
        {
            for(Reservation r : resList)
            {
                if(r.getDate().equals(dates.get(x)))
                {
                    count++;
                }
            }
        }return count<9;
    }

    public boolean checkAvailability(String chosenDate)
    {
        ArrayList<String> dates = new ArrayList<>();

        for(int i =0; i<resList.size();i++)
            dates.add(resList.get(i).getDate());

        int count = 0;

        for(Reservation r : resList)
        {
            if(r.getDate().equals(chosenDate))
                count++;
        }return count <9;
    }
    public void showReservation()
    {
        System.out.println("Show all Res \n");
        for(int i = 0; i < resList.size();i++)
        {
            System.out.println(resList.get(i));
        }
    }
    public void readFile() throws FileNotFoundException {
        File inputFile = new File("Manifest.txt");
        Scanner inFile = new Scanner(inputFile);

        while (inFile.hasNext())
        {
            String name, phone, date;
            name = inFile.next();
            phone = inFile.next();
            date = inFile.next();

            Reservation j = new Reservation(name, phone, date);
            resList.add(j);
        }

    }


}