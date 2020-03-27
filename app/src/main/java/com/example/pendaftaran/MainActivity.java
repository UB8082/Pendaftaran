package com.example.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttnExit = (Button)findViewById(R.id.bttnKembali);
        bttnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        Button btnDaftar = (Button) findViewById(R.id.btnDaftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
