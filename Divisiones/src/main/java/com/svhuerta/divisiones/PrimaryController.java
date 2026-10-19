package com.svhuerta.divisiones;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    @FXML private ListView<Integer> listDivisores;

    @FXML
    private void handleAnalizar(ActionEvent event) {
        try {
            int num = Integer.parseInt(txtNumero.getText());
            if (num <= 0) return;

            int temp = num;
            int cantCifras = 0;
            int sumaImpares = 0;
            int sumaPares = 0;
            int sumaTotal = 0;
            int cifraMayor = 0;
            int cifraMenor = 9;

            while (temp > 0) {
                int digito = temp % 10;
                cantCifras++;
                sumaTotal += digito;

                if (digito % 2 == 0) {
                    sumaPares += digito;
                } else {
                    sumaImpares += digito;
                }

                if (digito > cifraMayor) cifraMayor = digito;
                if (digito < cifraMenor) cifraMenor = digito;

                temp /= 10;
            }

            txtCantCifras.setText(String.valueOf(cantCifras));
            txtSumaImpares.setText(String.valueOf(sumaImpares));
            txtSumaPares.setText(String.valueOf(sumaPares));
            txtSumaTotal.setText(String.valueOf(sumaTotal));
            txtCifraMayor.setText(String.valueOf(cifraMayor));
            txtCifraMenor.setText(String.valueOf(cifraMenor));

            listDivisores.getItems().clear();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    listDivisores.getItems().add(i);
                }
            }

        } catch (NumberFormatException e) {
            // Entrada no válida
        }
    }

    @FXML
    private void handleLimpiar(ActionEvent event) {
        txtNumero.clear();
        txtCantCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        listDivisores.getItems().clear();
    }
}