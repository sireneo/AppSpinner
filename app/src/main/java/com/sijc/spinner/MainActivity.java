package com.sijc.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ed1, ed2;
    private TextView tv1;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1  = (EditText)findViewById(R.id.txt_num1);
        ed2 = (EditText)findViewById(R.id.txt_otro);
        tv1 = (TextView)findViewById(R.id.txt_result);
        spinner1 = (Spinner)findViewById(R.id.spinner);

        String [] operaciones = {"Sumar","Multiplicar","dividir"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operaciones);
        spinner1.setAdapter(adapter);
    }
    //meotdo para calcular las operaciones
    public void Calcular(View view){
        String valor1 = ed1.getText().toString();
        String valor2 = ed2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        String seleccionar = spinner1.getSelectedItem().toString();

        if (seleccionar.equals("Sumar")){
            int suma = num1 + num2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if (seleccionar.equals("Multiplicar")){
            int producto = num1 * num2;
            String resultado = String.valueOf(producto);
            tv1.setText(resultado);
        }
    }
}