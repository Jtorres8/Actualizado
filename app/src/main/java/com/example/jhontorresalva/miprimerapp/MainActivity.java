package com.example.jhontorresalva.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btnClic);
    }

    public void cli(View view){

        Toast.makeText(this, android.R.id.btnClic, Toast.LENGTH_LONG).show();
    }
}
