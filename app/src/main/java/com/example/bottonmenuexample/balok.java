package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
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

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = "https://akcdn.detik.net.id/visual/2023/02/24/ilustrasi-bangun-ruang-balok_169.jpeg?w=650";

        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background) // Gambar placeholder jika gambar belum dimuat
                .error(R.drawable.ic_launcher_foreground) // Gambar yang ditampilkan jika terjadi kesalahan
                .into(imageView);
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
