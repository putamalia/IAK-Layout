package com.example.asepmohamadnoor.belajar_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Putriamalia extends AppCompatActivity {
        Button tombol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putriamalia);

        tombol = (Button) findViewById(R.id.Masuk);



        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Putriamalia.this, MainActivity.class);
                startActivity(i);

            }
        }
        );
    }
}
