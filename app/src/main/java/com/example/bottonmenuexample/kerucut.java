package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class kerucut extends AppCompatActivity {

    private EditText editTextJariJari;
    private EditText editTextTinggi;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kerucut);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        textViewResult = findViewById(R.id.textViewResult);

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = "https://cdn.medcom.id/dynamic/content/2023/08/15/1602595/pN0se1m6Sc.jpeg?w=480";

        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background) // Gambar placeholder jika gambar belum dimuat
                .error(R.drawable.ic_launcher_foreground) // Gambar yang ditampilkan jika terjadi kesalahan
                .into(imageView);
    }

    public void calculateVolume(View view) {
        String jariJariStr = editTextJariJari.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        float jariJari = Float.parseFloat(jariJariStr);
        float tinggi = Float.parseFloat(tinggiStr);

        float volume = (float) ((1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi);

        textViewResult.setText("Volume Kerucut: " + volume);
    }
}
