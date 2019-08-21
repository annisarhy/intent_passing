package com.example.intent_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void buttonFood(View view) {
        Intent explicit = new Intent(this, Main3Activity.class);
        startActivity(explicit);
    }

    public void buttonBike(View view) {
        Intent explicit = new Intent(this, Main5Activity.class);
        startActivity(explicit);
    }

    public void buttonMart(View view) {
        Intent explicit = new Intent(this, Main5Activity.class);
        startActivity(explicit);
    }

    public void buttonBox(View view) {
        Intent explicit = new Intent(this, Main5Activity.class);
        startActivity(explicit);
    }
}
