package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kubus extends AppCompatActivity {
    private EditText editTextSisi;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);

        editTextSisi = findViewById(R.id.editTextSisi);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateVolume(View view) {

        String sisiStr = editTextSisi.getText().toString();

        float sisi = Float.parseFloat(sisiStr);

        float volume = (float) Math.pow(sisi, 3);

        textViewResult.setText("Volume Kubus: " + volume);
    }
}
