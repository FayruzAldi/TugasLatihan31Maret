package bangunDatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Segitiga extends AppCompatActivity {

    private EditText editTextAlas;
    private EditText editTextTinggi;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLuasSegitiga();
            }
        });
    }

    private void calculateLuasSegitiga() {
        String strAlas = editTextAlas.getText().toString().trim();
        String strTinggi = editTextTinggi.getText().toString().trim();

        if (strAlas.isEmpty() || strTinggi.isEmpty()) {
            Toast.makeText(this, "Masukkan alas dan tinggi segitiga terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double alas = Double.parseDouble(strAlas);
        double tinggi = Double.parseDouble(strTinggi);
        double luas = 0.5 * alas * tinggi;

        textViewResult.setText(String.format("Luas Segitiga: %.2f", luas));
    }
}
