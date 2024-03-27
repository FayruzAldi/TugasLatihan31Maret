package bangunDatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class Persegi extends AppCompatActivity {

    private EditText editTextSisi;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        editTextSisi = findViewById(R.id.editTextSisi);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLuasPersegi();
            }
        });
    }

    private void calculateLuasPersegi() {
        String strSisi = editTextSisi.getText().toString().trim();

        if (strSisi.isEmpty()) {
            Toast.makeText(this, "Masukkan panjang sisi persegi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi = Double.parseDouble(strSisi);
        double luas = Math.pow(sisi, 2);

        textViewResult.setText(String.format("Luas Persegi: %.2f", luas));
    }
}
