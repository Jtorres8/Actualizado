package com.example.jhontorresalva.miprimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void antes(View view){
        Toast.makeText(this, "Anterior", Toast.LENGTH_SHORT).show();
        Intent atras = new Intent(this, MainActivity.class );
        startActivity(atras);
    }
}
