package com.example.uygulama1;

import
        android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText_sayi1,editText_sayi2;
    RadioButton radioButtonTopla,radioButtonCikar,radioButtonCarp,radioButtonBol;
    Button button_Hesapla;
    TextView textViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText_sayi1=findViewById(R.id.editTextNumber_sayi1);
        editText_sayi2=findViewById(R.id.editTextNumber_sayi2);
        radioButtonTopla=findViewById(R.id.radioButton_topla);
        radioButtonCikar=findViewById(R.id.radioButton_cikar);
        radioButtonCarp=findViewById(R.id.radioButton_carp);
        radioButtonBol=findViewById(R.id.radioButton_bol);
        button_Hesapla=findViewById(R.id.button_Hesapla);
        textViewSonuc=findViewById(R.id.textView_sonuc);

        button_Hesapla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double sayi1=Double.parseDouble(editText_sayi1.getText().toString());
                double sayi2=Double.parseDouble(editText_sayi2.getText().toString());
                double sonuc=0;

                if (radioButtonTopla.isChecked()){
                    sonuc=sayi1+sayi2;
                }

                else if (radioButtonCikar.isChecked()){
                    sonuc=sayi1-sayi2;
                }
                else if (radioButtonCarp.isChecked()){
                    sonuc=sayi1*sayi2;
                }

                else {
                    sonuc=sayi1/sayi2;
                }

                textViewSonuc.setText("Sonuç: "+sonuc);

            }
        });

    }
}