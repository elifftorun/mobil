package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewTakim;
    RadioButton radioButtonGalatasaray,radioButtonFener,radioButtonBesiktas,radioButtonTabzon;
    Button buttonSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageViewTakim=findViewById(R.id.imageView_takim);
        radioButtonGalatasaray=findViewById(R.id.radioButton_Galatasaray);
        radioButtonFener=findViewById(R.id.radioButton_fener);
        radioButtonBesiktas=findViewById(R.id.radioButton_besiktas);
        radioButtonTabzon=findViewById(R.id.radioButton_trabzon);
        buttonSec=findViewById(R.id.button2);

        buttonSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonGalatasaray.isChecked()){
                   imageViewTakim.setImageResource(R.drawable.g);
                }

                else if (radioButtonFener.isChecked()){
                    imageViewTakim.setImageResource(R.drawable.f);
                }

                else if (radioButtonBesiktas.isChecked()){
                    imageViewTakim.setImageResource(R.drawable.b);
                }

                else {
                    imageViewTakim.setImageResource(R.drawable.t);
                }
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}