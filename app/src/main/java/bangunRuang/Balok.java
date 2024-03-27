package bangunRuang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Balok extends AppCompatActivity {

    private EditText editTextPanjang;
    private EditText editTextLebar;
    private EditText editTextTinggi;
    private Button buttonCalculateVolume;
    private TextView textViewResultVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonCalculateVolume = findViewById(R.id.buttonCalculateVolume);
        textViewResultVolume = findViewById(R.id.textViewResultVolume);

        buttonCalculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateVolumeBalok();
            }
        });
    }

    private void calculateVolumeBalok() {
        String strPanjang = editTextPanjang.getText().toString().trim();
        String strLebar = editTextLebar.getText().toString().trim();
        String strTinggi = editTextTinggi.getText().toString().trim();

        if (strPanjang.isEmpty() || strLebar.isEmpty() || strTinggi.isEmpty()) {
            Toast.makeText(this, "Masukkan panjang, lebar, dan tinggi balok terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double panjang = Double.parseDouble(strPanjang);
        double lebar = Double.parseDouble(strLebar);
        double tinggi = Double.parseDouble(strTinggi);
        double volume = panjang * lebar * tinggi;

        textViewResultVolume.setText(String.format("Volume Balok: %.2f", volume));
    }
}
