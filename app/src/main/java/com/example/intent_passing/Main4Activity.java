package com.example.intent_passing;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //intent get data
        Intent intent = getIntent();
        String nama = intent.getStringExtra("NAMA");
        String alamat = intent.getStringExtra("ALAMAT");
        String pesan = intent.getStringExtra("PESAN");

        //textview
        TextView mResultTv = findViewById(R.id.resultTv);

        //settext
        mResultTv.setText("Nama: "+nama+ "\nAlamat: "+alamat+"\nPesan: "+pesan);
    }

    public void buttonHomepage(View view) {
        Intent explicit = new Intent(this, MainActivity.class);
        startActivity(explicit);
    }
}
