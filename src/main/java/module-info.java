module com.example.yulonepoint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yulonepoint to javafx.fxml;
    exports com.example.yulonepoint;
}