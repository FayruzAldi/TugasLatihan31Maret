package bangunRuang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Kerucut extends AppCompatActivity {

    private EditText editTextJariJari, editTextTinggi;
    private Button buttonCalculateVolume;
    private TextView textViewResultVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonCalculateVolume = findViewById(R.id.buttonCalculateVolume);
        textViewResultVolume = findViewById(R.id.textViewResultVolume);

        buttonCalculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolumeKerucut();
            }
        });
    }

    private void calculateVolumeKerucut() {
        String strJariJari = editTextJariJari.getText().toString().trim();
        String strTinggi = editTextTinggi.getText().toString().trim();

        if (strJariJari.isEmpty() || strTinggi.isEmpty()) {
            Toast.makeText(this, "Masukkan jari-jari dan tinggi kerucut terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double jariJari = Double.parseDouble(strJariJari);
        double tinggi = Double.parseDouble(strTinggi);
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;

        textViewResultVolume.setText(String.format("Volume Kerucut: %.2f", volume));
    }
}
