module it.cisathmo.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.cisathmo.firstapp to javafx.fxml;
    exports it.cisathmo.firstapp;
}