package com.svhuerta.tablademultiplicar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtTabla;
    @FXML private ListView<String> listTabla;

    @FXML
    private void handleCalcular(ActionEvent event) {
        try {
            int num = Integer.parseInt(txtTabla.getText());
            listTabla.getItems().clear();

            for (int i = 1; i <= 10; i++) {
                String linea = num + " x " + i + " = " + (num * i);
                listTabla.getItems().add(linea);
            }

        } catch (NumberFormatException e) {
            // Manejo por si ingresan un valor no numérico o dejan el campo vacío
        }
    }

    @FXML
    private void handleLimpiar(ActionEvent event) {
        txtTabla.clear();
        listTabla.getItems().clear();
    }
}