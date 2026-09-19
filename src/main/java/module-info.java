module com.csc311_mod3_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.csc311_mod3_gui to javafx.fxml;
    exports com.csc311_mod3_gui;
}