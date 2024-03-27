package bangunRuang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class limassegitiga extends AppCompatActivity {

    private EditText etAlas, etTinggiAlas, etTinggiLimas;
    private Button btnHitung;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limassegitiga);

        etAlas = findViewById(R.id.et_alas);
        etTinggiAlas = findViewById(R.id.et_tinggi_alas);
        etTinggiLimas = findViewById(R.id.et_tinggi_limas);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLimas();
            }
        });
    }

    private void hitungLuasLimas() {
        double alas = Double.parseDouble(etAlas.getText().toString());
        double tinggiAlas = Double.parseDouble(etTinggiAlas.getText().toString());
        double tinggiLimas = Double.parseDouble(etTinggiLimas.getText().toString());

        double luasSegitiga = 0.5 * alas * tinggiAlas;
        double luasLimas = luasSegitiga * tinggiLimas;

        tvHasil.setText("Luas Limas Segitiga: " + luasLimas);
    }
}
