package com.example.estadosmexico_spinner_qacj;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    List<String> lista = new ArrayList<>(Arrays.asList("ESTADO DE MÉXICO", "GUADALAJARRA", "MUERTERREY", "PUEBLAYORK", "MATAULIPAS",
            "VERAKUSH", "OAXASHINTONG", "ZACATUERCAS"));

    Spinner escogeEstado, seleccionarEstado;
    ArrayAdapter<String> adaptador, adaptador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        escogeEstado = findViewById(R.id.escogeEstado);
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        escogeEstado.setAdapter(adaptador);

        escogeEstado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String seleccion = escogeEstado.getSelectedItem().toString();
                Toast.makeText(PrincipalActivity.this, "YO NUNCA VIVIRÍA EN: **" + seleccion + "** ALLÁ SÍ MATAN WE", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        seleccionarEstado = findViewById(R.id.seleccionarEstado);
        adaptador2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lista);
        adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seleccionarEstado.setAdapter(adaptador2);


        seleccionarEstado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String seleccion = seleccionarEstado.getSelectedItem().toString();
                Toast.makeText(PrincipalActivity.this, "SELECCIONASTE: **" + seleccion + "** ALLÍ SI ESTÁ BIEN CULERO PADRE", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}

