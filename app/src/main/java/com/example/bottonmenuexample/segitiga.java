package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class segitiga extends AppCompatActivity {
    private EditText editTextAlas;
    private EditText editTextTinggi;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateArea(View view) {
        // Ambil nilai alas dan tinggi dari EditText
        String alasStr = editTextAlas.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        // Ubah nilai alas dan tinggi menjadi float
        float alas = Float.parseFloat(alasStr);
        float tinggi = Float.parseFloat(tinggiStr);

        // Hitung luas segitiga
        float area = (alas * tinggi) / 2;

        // Tampilkan hasilnya di TextView
        textViewResult.setText("Luas Segitiga: " + area);
    }
}
