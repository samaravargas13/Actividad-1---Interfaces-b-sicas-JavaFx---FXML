package com.svhuerta.cifrasdivisiones;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtCifras;

    @FXML
    private TextField txtImpares;

    @FXML
    private TextField txtPares;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtMayor;

    @FXML
    private TextField txtMenor;

    @FXML
    private TextArea txtDivisores;

    @FXML
    private void analizar() {

        int numero = Integer.parseInt(txtNumero.getText());

        String texto = String.valueOf(numero);

        int cantidad = texto.length();
        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaTotal = 0;

        int mayor = Character.getNumericValue(texto.charAt(0));
        int menor = Character.getNumericValue(texto.charAt(0));

        for (int i = 0; i < texto.length(); i++) {

            int cifra = Character.getNumericValue(texto.charAt(i));

            sumaTotal += cifra;

            if (cifra % 2 == 0) {
                sumaPares += cifra;
            } else {
                sumaImpares += cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }
        }

        txtCifras.setText(String.valueOf(cantidad));
        txtImpares.setText(String.valueOf(sumaImpares));
        txtPares.setText(String.valueOf(sumaPares));
        txtTotal.setText(String.valueOf(sumaTotal));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

        String divisores = "";

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + "\n";
            }
        }

        txtDivisores.setText(divisores);
    }

    @FXML
    private void limpiar() {

        txtNumero.clear();
        txtCifras.clear();
        txtImpares.clear();
        txtPares.clear();
        txtTotal.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();
    }
}