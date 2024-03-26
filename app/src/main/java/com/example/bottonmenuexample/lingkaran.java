package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lingkaran extends AppCompatActivity {
    private EditText editTextJariJari;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void calculateArea(View view) {
        String jariJariStr = editTextJariJari.getText().toString();
        float jariJari = Float.parseFloat(jariJariStr);
        float area = (float) (Math.PI * Math.pow(jariJari, 2));
        textViewResult.setText("Luas Lingkaran: " + area);
    }
}
