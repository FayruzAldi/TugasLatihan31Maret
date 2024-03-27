package bangunDatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Lingkaran extends AppCompatActivity {

    private EditText editTextRadius;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        editTextRadius = findViewById(R.id.editTextRadius);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLuasLingkaran();
            }
        });
    }

    private void calculateLuasLingkaran() {
        String strRadius = editTextRadius.getText().toString().trim();

        if (strRadius.isEmpty()) {
            Toast.makeText(this, "Masukkan jari-jari lingkaran terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double radius = Double.parseDouble(strRadius);
        double luas = Math.PI * Math.pow(radius, 2);

        textViewResult.setText(String.format("Luas Lingkaran: %.2f", luas));
    }
}
