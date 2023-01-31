package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;


public class HelloController {

    //Nights
    @FXML
    private DatePicker checkIn;
    @FXML
    private Text date1;
    @FXML
    private DatePicker checkOut;
    @FXML
    private Text date2;


    public void Cancel(ActionEvent e) {
        System.out.println("You clicked Cancel");
    }
    public void Add(ActionEvent e) {
        System.out.println("You clicked Add");
    }

    public void CheckInDate(ActionEvent actionEvent) {
        date1.setText(checkIn.getValue().toString());
    }

    public void CheckOutDate(ActionEvent actionEvent) {
        date2.setText(checkOut.getValue().toString());
    }

}