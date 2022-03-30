module com.example.carshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.carshop to javafx.fxml;
    exports com.example.carshop;
}