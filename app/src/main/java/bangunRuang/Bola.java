package bangunRuang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Bola extends AppCompatActivity {

    private EditText editTextJariJari;
    private Button buttonCalculateVolume;
    private TextView textViewResultVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        buttonCalculateVolume = findViewById(R.id.buttonCalculateVolume);
        textViewResultVolume = findViewById(R.id.textViewResultVolume);

        buttonCalculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolumeBola();
            }
        });
    }

    private void calculateVolumeBola() {
        String strJariJari = editTextJariJari.getText().toString().trim();

        if (strJariJari.isEmpty()) {
            Toast.makeText(this, "Masukkan jari-jari bola terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double jariJari = Double.parseDouble(strJariJari);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        textViewResultVolume.setText(String.format("Volume Bola: %.2f", volume));
    }
}
