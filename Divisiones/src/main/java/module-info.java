module com.svhuerta.divisiones {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svhuerta.divisiones to javafx.fxml;
    exports com.svhuerta.divisiones;
}
