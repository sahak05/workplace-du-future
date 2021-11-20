module com.example.yulonepoint {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.yulonepoint to javafx.fxml;
    exports com.example.yulonepoint;
}