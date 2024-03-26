package com.example.bottonmenuexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class persegipanjang extends AppCompatActivity {
    private EditText editTextLength;
    private EditText editTextWidth;
    private TextView textViewResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateArea(View view) {
        String lengthStr = editTextLength.getText().toString();
        String widthStr = editTextWidth.getText().toString();

        float length = Float.parseFloat(lengthStr);
        float width = Float.parseFloat(widthStr);

        float area = length * width;

        // Tampilkan hasilnya di TextView
        textViewResult.setText("Luas Persegi Panjang: " + area);
    }
}
