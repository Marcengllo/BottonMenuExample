package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class persegi  extends AppCompatActivity {
    EditText editTextSisi;
    Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);

        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = "https://t1.gstatic.com/licensed-image?q=tbn:ANd9GcQRMdhid5P1JGVYD9LWMrAy4qaRhLq0G5HOLkRvK6ORTI2-az7FWgB4M-IPYd1nGYoA";

        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background) // Gambar placeholder jika gambar belum dimuat
                .error(R.drawable.ic_launcher_foreground) // Gambar yang ditampilkan jika terjadi kesalahan
                .into(imageView);
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasDanKeliling();
            }
        });
    }

    private void hitungLuasDanKeliling() {
        String inputSisi = editTextSisi.getText().toString().trim();

        if (inputSisi.isEmpty()) {
            Toast.makeText(this, "Masukkan panjang sisi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi = Double.parseDouble(inputSisi);
        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        String hasil = "Luas: " + luas + ", Keliling: " + keliling;
        Toast.makeText(this, hasil, Toast.LENGTH_SHORT).show();
    }
}
