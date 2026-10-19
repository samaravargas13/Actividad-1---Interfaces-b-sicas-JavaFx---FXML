package com.svhuerta.edadpersona;

import java.time.LocalDate;
import java.time.Period;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFecha;
    
    @FXML
    private Label lblResultado;
    
    @FXML
    private void calcular() {
        
        String[] fecha = txtFecha.getText().split("/");
        
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt (fecha[1]);
        int anio = Integer.parseInt(fecha[2]);
        
        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate actual = LocalDate.now();
        
        Period edad = Period.between(nacimiento, actual);
        
        lblResultado.setText(
                "Tiene " + edad.getYears()
                + " años y"
                + edad.getMonths()
                + " meses");
    
    }
    
    @FXML
    private void limpiar () {
        txtFecha.clear();
        lblResultado.setText("");
        
    }
}