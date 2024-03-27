package bangunDatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan31maret.R;

public class BelahKetupat extends AppCompatActivity {

    private EditText editTextDiagonal1;
    private EditText editTextDiagonal2;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);

        editTextDiagonal1 = findViewById(R.id.editTextDiagonal1);
        editTextDiagonal2 = findViewById(R.id.editTextDiagonal2);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLuasBelahKetupat();
            }
        });
    }

    private void calculateLuasBelahKetupat() {
        String strDiagonal1 = editTextDiagonal1.getText().toString().trim();
        String strDiagonal2 = editTextDiagonal2.getText().toString().trim();

        if (strDiagonal1.isEmpty() || strDiagonal2.isEmpty()) {
            Toast.makeText(this, "Masukkan panjang diagonal terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double diagonal1 = Double.parseDouble(strDiagonal1);
        double diagonal2 = Double.parseDouble(strDiagonal2);

        double luas = (diagonal1 * diagonal2) / 2;

        textViewResult.setText(String.format("Luas Belah Ketupat: %.2f", luas));
    }
}
