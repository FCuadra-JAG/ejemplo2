module com.example.ejemplo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplo2 to javafx.fxml;
    exports com.example.ejemplo2;
}