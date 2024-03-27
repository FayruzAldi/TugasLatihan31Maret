package bangunDatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class PersegiPanjang extends AppCompatActivity {

    private EditText editTextPanjang;
    private EditText editTextLebar;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLuasPersegiPanjang();
            }
        });
    }

    private void calculateLuasPersegiPanjang() {
        String strPanjang = editTextPanjang.getText().toString().trim();
        String strLebar = editTextLebar.getText().toString().trim();

        if (strPanjang.isEmpty() || strLebar.isEmpty()) {
            Toast.makeText(this, "Masukkan panjang dan lebar persegi panjang terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double panjang = Double.parseDouble(strPanjang);
        double lebar = Double.parseDouble(strLebar);
        double luas = panjang * lebar;

        textViewResult.setText(String.format("Luas Persegi Panjang: %.2f", luas));
    }
}
