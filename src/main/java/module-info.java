module com.example.carshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.carshop to javafx.fxml;
    exports com.example.carshop;
}