package bangunRuang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Tabung extends AppCompatActivity {

    private EditText etJariJari, etTinggi;
    private Button btnHitung;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        etJariJari = findViewById(R.id.et_jari_jari);
        etTinggi = findViewById(R.id.et_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeTabung();
            }
        });
    }

    private void hitungVolumeTabung() {
        double jariJari = Double.parseDouble(etJariJari.getText().toString());
        double tinggi = Double.parseDouble(etTinggi.getText().toString());

        // Rumus volume tabung: π * jari-jari^2 * tinggi
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;

        tvHasil.setText("Volume Tabung: " + volume);
    }
}
