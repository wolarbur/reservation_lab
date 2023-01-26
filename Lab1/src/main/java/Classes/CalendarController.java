package Classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

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
            new Reservation("John Doe", "478 927 772","01/09/2023"),
            new Reservation("Alex Smith", "222 222 222","01/09/2023")
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

        resList.add(y);

        if(resList.size()>9)
        {
            resList.remove(9);
            System.out.print("The hotel is full");
            y.setBookStatus("No");
        }
        System.out.print(y);

        // limiting 9 reservations per day
        /*
        int count = 0;
        ArrayList<String> dateTester= new ArrayList<String>();
        for(Reservation x : resList){
            for(int i = 0; i<resList.size();i++)
            {
                if(x.getDate().equals(dateTester.get(i))&& count<9)
                    count++;
                else if(x.getDate().compareTo(dateTester.get(i))!=0)
                {
                    dateTester.add(x.getDate());
                }
            }

        }*/

    }
    // get check-in date and store it in d1
    public void getDate1(ActionEvent event){
        LocalDate myDate1 = datePicker1.getValue();
        d1 = myDate1.format(DateTimeFormatter.ofPattern("MM/DD/YYYY"));
    }


}