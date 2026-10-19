module com.svhuerta.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svhuerta.tablademultiplicar to javafx.fxml;
    exports com.svhuerta.tablademultiplicar;
}
