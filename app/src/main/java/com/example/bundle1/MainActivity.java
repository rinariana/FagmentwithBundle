package com.example.bundle1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtPekerjaan, edtNohp, edtLamaKerja, edtKompetensi, edtAsalSekolah;
    String Namanya, Alamatnya, Pekerjaannya, Nohpnya, LamaKerjanya, Kompetensinya, AsalSekolahnya;
    Button btnInput;
    Pegawai pegawainya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.Edt_Nama);
        edtAlamat = (EditText) findViewById(R.id.Edt_Alamat);
        edtPekerjaan = (EditText) findViewById(R.id.Edt_Pekerjaan);
        edtNohp = (EditText) findViewById(R.id.Edt_Nohp);
        edtLamaKerja = (EditText) findViewById(R.id.Edt_Lamakerja);
        edtKompetensi = (EditText) findViewById(R.id.Edt_Kompetensi);
        edtAsalSekolah = (EditText) findViewById(R.id.Edt_Asalsekolah);


        btnInput = (Button) findViewById(R.id.Btn_Input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Namanya = edtNama.getText().toString();
                Alamatnya = edtAlamat.getText().toString();
                Pekerjaannya = edtPekerjaan.getText().toString();
                Nohpnya = edtNohp.getText().toString();
                Kompetensinya = edtKompetensi.getText().toString();
                LamaKerjanya = edtLamaKerja.getText().toString();
                AsalSekolahnya = edtAsalSekolah.getText().toString();
                pegawainya = new Pegawai(Namanya, Alamatnya, Pekerjaannya, Nohpnya, LamaKerjanya, AsalSekolahnya, Kompetensinya);
                Intent kirim = new Intent(MainActivity.this, DetailActivity.class);
                kirim.putExtra("xyz", (Serializable) pegawainya);
                startActivity(kirim);
            }
        });
    }
}