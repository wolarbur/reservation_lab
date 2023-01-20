package com.example.lab1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CalendarController implements Initializable{
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private ListView<String> roomListView;
    @FXML
    private Label roomLabel;

    String[] rooms = {"101", "102", "103","104","105"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roomListView.getItems().addAll(rooms);


    }
}