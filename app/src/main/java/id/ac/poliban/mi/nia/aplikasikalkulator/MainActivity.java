package id.ac.poliban.mi.nia.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edAngkaPertama = findViewById(R.id.edAngkaPertama);
        EditText edAngkaKedua = findViewById(R.id.edAngkaKedua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersihkan = findViewById(R.id.btBersihkan);
        TextView tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(v ->{
            double a = Double.parseDouble(edAngkaPertama.getText().toString());
            double b = Double.parseDouble(edAngkaKedua.getText().toString());
            double hasil = a+b;
            tvHasil.setText(String.valueOf(hasil));
        });

        btKurang.setOnClickListener(v ->{
            double a = Double.parseDouble(edAngkaPertama.getText().toString());
            double b = Double.parseDouble(edAngkaKedua.getText().toString());
            double hasil = a-b;
            tvHasil.setText(String.valueOf(hasil));
        });

        btKali.setOnClickListener(v ->{
            double a = Double.parseDouble(edAngkaPertama.getText().toString());
            double b = Double.parseDouble(edAngkaKedua.getText().toString());
            double hasil = a*b;
            tvHasil.setText(String.valueOf(hasil));
        });

        btBagi.setOnClickListener(v ->{
            double a = Double.parseDouble(edAngkaPertama.getText().toString());
            double b = Double.parseDouble(edAngkaKedua.getText().toString());
            double hasil = a/b;
            tvHasil.setText(String.valueOf(hasil));
        });

        btBersihkan.setOnClickListener(v -> {
            edAngkaPertama.setText("");
            edAngkaKedua.setText("");
            tvHasil.setText(String.valueOf("Hasil"));
            edAngkaPertama.requestFocus();
        });

    }
}
