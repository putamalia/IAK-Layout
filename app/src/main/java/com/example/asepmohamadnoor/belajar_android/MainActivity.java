package com.example.asepmohamadnoor.belajar_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tombolshare, isi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombolshare = (TextView) findViewById(R.id.textView);
        isi = (TextView) findViewById(R.id.textView2);

        tombolshare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {
                Intent i;
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }
        });



    }
}
