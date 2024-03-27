package bangunRuang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Kubus extends AppCompatActivity {

    private EditText editTextSisi;
    private Button buttonCalculateVolume;
    private TextView textViewResultVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        editTextSisi = findViewById(R.id.editTextSisi);
        buttonCalculateVolume = findViewById(R.id.buttonCalculateVolume);
        textViewResultVolume = findViewById(R.id.textViewResultVolume);

        buttonCalculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolumeKubus();
            }
        });
    }

    private void calculateVolumeKubus() {
        String strSisi = editTextSisi.getText().toString().trim();

        if (strSisi.isEmpty()) {
            Toast.makeText(this, "Masukkan panjang sisi kubus terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi = Double.parseDouble(strSisi);
        double volume = Math.pow(sisi, 3);

        textViewResultVolume.setText(String.format("Volume Kubus: %.2f", volume));
    }
}
