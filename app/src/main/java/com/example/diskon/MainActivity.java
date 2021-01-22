package com.example.diskon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etharga,etdikon;
    private Button btnhasil;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etharga=findViewById(R.id.etharga);
        etdikon=findViewById(R.id.etdiskon);
        btnhasil=findViewById(R.id.tbnhasil);
        tvhasil=findViewById(R.id.tvhasil);
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer harga=Integer.parseInt(etharga.getText().toString());
                Integer ndiskon=Integer.parseInt(etdikon.getText().toString());
                Integer diskon= harga*ndiskon;
                Integer totaldisk=diskon/100;
                Integer totalbayar =harga-totaldisk;
                tvhasil.setText(String.valueOf(totalbayar));
            }
        });
    }
}
