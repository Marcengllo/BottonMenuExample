package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

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
        ImageView imageView = findViewById(R.id.imageView);

        String imageUrl = "https://asset-a.grid.id//crop/0x0:0x0/700x0/photo/2022/03/29/tabungjpeg-20220329043914.jpeg";

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

        float volume = (float) (Math.PI * Math.pow(jariJari, 2) * tinggi);

        // Tampilkan hasilnya di TextView
        textViewResult.setText("Volume Silinder: " + volume);
    }
}
