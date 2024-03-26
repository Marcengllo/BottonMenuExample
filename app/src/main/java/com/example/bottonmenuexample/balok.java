package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class balok extends AppCompatActivity {

    private EditText editTextPanjang;
    private EditText editTextLebar;
    private EditText editTextTinggi;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balok);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateVolume(View view) {
        String panjangStr = editTextPanjang.getText().toString();
        String lebarStr = editTextLebar.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        float panjang = Float.parseFloat(panjangStr);
        float lebar = Float.parseFloat(lebarStr);
        float tinggi = Float.parseFloat(tinggiStr);

        float volume = panjang * lebar * tinggi;

        textViewResult.setText("Volume Balok: " + volume);
    }
}
