package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class silinder extends AppCompatActivity {
    private EditText editTextJariJari;
    private EditText editTextTinggi;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.silinder);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateVolume(View view) {
        String jariJariStr = editTextJariJari.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        float jariJari = Float.parseFloat(jariJariStr);
        float tinggi = Float.parseFloat(tinggiStr);

        float volume = (float) (Math.PI * Math.pow(jariJari, 2) * tinggi);

        // Tampilkan hasilnya di TextView
        textViewResult.setText("Volume Silinder: " + volume);
    }
}
