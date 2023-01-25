package Classes;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CalendarController implements Initializable{
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label roomLabel; //available rooms
    @FXML

    //Table setup
    private  TableView<Reservation> roomTable;//main table
    @FXML
    private TableColumn<Reservation, String> nameColumn;
    @FXML
    private TableColumn<Reservation, String> statusColumn;
    @FXML
    private TableColumn<Reservation, Integer> sizeColumn;

    ObservableList<Reservation> resList = FXCollections.observableArrayList(
            new Reservation("John Doe", "yes", 5),
            new Reservation("Alex Smith", "yes", 4)

    );






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Table for displaying reservation info
        nameColumn.setCellValueFactory(new PropertyValueFactory<Reservation, String>("roomName"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<Reservation, String>("isBook"));
        sizeColumn.setCellValueFactory(new PropertyValueFactory<Reservation, Integer>("roomSize"));

        roomTable.setItems(resList);




    }
}