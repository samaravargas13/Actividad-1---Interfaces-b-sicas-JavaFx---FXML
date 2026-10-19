module com.svhuerta.cifrasdivisiones {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svhuerta.cifrasdivisiones to javafx.fxml;
    exports com.svhuerta.cifrasdivisiones;
}
