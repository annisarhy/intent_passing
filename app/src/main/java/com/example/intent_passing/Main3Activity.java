package com.example.intent_passing;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        //editText
        final EditText mNama = findViewById(R.id.nama);
        final EditText mAlamat = findViewById(R.id.alamat);
        final EditText mPesan = findViewById(R.id.pesan);

        //button
        Button mMasuk = findViewById(R.id.masuk);

        //Button click

        mMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //data edit text

                String nama = mNama.getText().toString();
                String alamat = mAlamat.getText().toString();
                String pesan = mPesan.getText().toString();

                //intent nya
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("NAMA", nama);
                intent.putExtra("ALAMAT", alamat);
                intent.putExtra("PESAN", pesan);
                startActivity(intent);
            }
        });
    }
}
