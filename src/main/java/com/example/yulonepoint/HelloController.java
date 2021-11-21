package com.example.yulonepoint;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label Profile;
    Employee employee = new Employee("Marc-Arthur", "XOXO", "marc-arthur.xoxo@onecompany.org");


    @FXML
    protected void onHelloButtonClick() {
        Profile.setText(employee.profile());
    }

    @FXML
    protected void creerUneActivite() {

    }

   
}