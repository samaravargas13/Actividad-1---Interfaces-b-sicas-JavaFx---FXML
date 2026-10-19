module com.svhuerta.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svhuerta.desglosedinero to javafx.fxml;
    exports com.svhuerta.desglosedinero;
}
