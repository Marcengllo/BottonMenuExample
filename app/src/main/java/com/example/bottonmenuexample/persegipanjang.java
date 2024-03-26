package com.example.bottonmenuexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

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

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = "https://cdn0-production-images-kly.akamaized.net/Ndj6uHSUufXXhsB4tQ_Mt7hnaRY=/500x281/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3409131/original/045818300_1616496131-persegi_panjang.jpg";

        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background) // Gambar placeholder jika gambar belum dimuat
                .error(R.drawable.ic_launcher_foreground) // Gambar yang ditampilkan jika terjadi kesalahan
                .into(imageView);
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
