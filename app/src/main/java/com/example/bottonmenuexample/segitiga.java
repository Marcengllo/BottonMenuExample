package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

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

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = "https://cdn0-production-images-kly.akamaized.net/HMlQZTZBi9T7WUSt6wXjJFv2sic=/500x667/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3471854/original/039486200_1622699012-sama_sisi.jpg";

        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background) // Gambar placeholder jika gambar belum dimuat
                .error(R.drawable.ic_launcher_foreground) // Gambar yang ditampilkan jika terjadi kesalahan
                .into(imageView);
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
