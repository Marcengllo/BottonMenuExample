package com.example.bottonmenuexample;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class lingkaran extends AppCompatActivity {
    private EditText editTextJariJari;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        textViewResult = findViewById(R.id.textViewResult);

        ImageView imageView = findViewById(R.id.imageView);
        String imageUrl = "https://awsimages.detik.net.id/community/media/visual/2018/03/08/2e61153c-d96d-4c90-8bac-87ccf009245b.jpeg?w=600&q=90";

        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background) // Gambar placeholder jika gambar belum dimuat
                .error(R.drawable.ic_launcher_foreground) // Gambar yang ditampilkan jika terjadi kesalahan
                .into(imageView);
    }

    public void calculateArea(View view) {
        String jariJariStr = editTextJariJari.getText().toString();
        float jariJari = Float.parseFloat(jariJariStr);
        float area = (float) (Math.PI * Math.pow(jariJari, 2));
        textViewResult.setText("Luas Lingkaran: " + area);
    }
}
