package com.example.hijabstore;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.example.hijabstore.model.Hijab;

public class DaftarHijabActivity extends AppCompatActivity {
    public final static String HIJAB_TERPILIH ="hijab_obj_key";
    List<Hijab> hijabs;
    ListView listView;
    String jenisHijab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hijab);
        Intent intent = getIntent();
        jenisHijab = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR  HIJAB "+jenisHijab.toUpperCase());
        hijabs = DataProvider.getHijabsByTipe(this,jenisHijab);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hijab);
        DaftarHijabAdapter adapter = new DaftarHijabAdapter(this,hijabs);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Hijab terpilih = hijabs.get(position);
            bukaProfileHijab(terpilih);
        }
    };

    private void bukaProfileHijab(Hijab hijabTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileHijab.class);
        intent.putExtra(HIJAB_TERPILIH, hijabTerpilih);
        startActivity(intent);
    }


}
