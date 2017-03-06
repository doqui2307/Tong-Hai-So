package com.example.asus.tong2so;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtv1, txtv2;
    EditText edtSo1, edtSo2;
    Button btnTong;
    TextView txtvKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtv1= (TextView) findViewById(R.id.textView2);
        txtv2= (TextView) findViewById(R.id.textView3);
        txtv1.setText("Số a:");
        txtv2.setText("Số b:");
        edtSo1 = (EditText) findViewById(R.id.editTextSo1);
        edtSo2 = (EditText) findViewById(R.id.editTextSo2);
        txtvKetqua = (TextView) findViewById(R.id.textViewKetQua);
        btnTong = (Button) findViewById(R.id.buttonTong);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edtSo1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                String chuoi2 = edtSo1.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int tong = so1 + so2;

                txtvKetqua.setText( String.valueOf(tong));
            }
        });
    }
}
