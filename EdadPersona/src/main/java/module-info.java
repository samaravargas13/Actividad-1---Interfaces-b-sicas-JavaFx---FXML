module com.svhuerta.edadpersona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svhuerta.edadpersona to javafx.fxml;
    exports com.svhuerta.edadpersona;
}
