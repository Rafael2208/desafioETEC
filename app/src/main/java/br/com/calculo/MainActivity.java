package br.com.calculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editAltura = findViewById(R.id.editAlturaRe);
        final EditText editBase = findViewById(R.id.editBaseRe);
        final TextView textResultado = findViewById(R.id.textResultado);
        Button btnConverter = findViewById(R.id.buttonCalcular);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valor, altura , base ;


                altura = Double.parseDouble(editAltura.getText().toString());
                base = Double.parseDouble(editBase.getText().toString());

                //Calculo do Retângulo  "Altura" x "Base"
                valor = altura * base;

                //Conversão de número para "String", para mostrar o resultado na Tela
                textResultado.setText(String.valueOf(valor));
            }
        });

    }

}