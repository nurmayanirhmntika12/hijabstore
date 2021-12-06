package com.example.hijabstore;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.hijabstore.model.Bergo;
import com.example.hijabstore.model.Hijab;
import com.example.hijabstore.model.Pashmina;
import  com.example.hijabstore.model.Square;

public class DataProvider {
    private static List<Hijab> hijabs = new ArrayList<>();

    private static List<Pashmina> initDataPashmina(Context ctx) {
        List<Pashmina> pashminas = new ArrayList<>();
        pashminas.add(new Pashmina("Pashmina Plisket", "Bahan Ceruty Premium",
                "Full Plisket tanpa garis tengah,Ukuran 180x75 cm( Setelah diplisket kurang lebih bisa jadi 65 cm", R.drawable.plisket));
        pashminas.add(new Pashmina("Pashmina Ceruty Babydoll", "Bahan Ceruty Grade A Premium",
                "Ukuran 75x180cm(-+5cm),Jahitan tepi rapi,Adem", R.drawable.ceruty));
        pashminas.add(new Pashmina("Pashmina Crincle", "Bahan Katun Handmade",
                "Ukuran 100x200cm (Bisa dijadikan hijab segiempat),Bahan adem,tidak nerawang,lebar,mudah dibentuk,tidak perlu disetrika", R.drawable.crincle));
        pashminas.add(new Pashmina("Pashmina Payet Bunga", "Bahan Ceruty Babydoll",
                "Tidak mudah kusut, Lembut ,Tidak panas Elegan , mewah dan trendy", R.drawable.pashmina_payet));
        pashminas.add(new Pashmina("Pashmina Motif", "Bahan Satin",
                "Mudah dibentuk dan terasa nyaman dikenakan sepanjang hari.", R.drawable.pashmina_motif));
        pashminas.add(new Pashmina("Pashmina Tali", "Bahan Diamond Italiano Premium",
                "Ukuran 175x75cm Bahan adem,tidak nerawang,mudah dibentuk", R.drawable.pashmina_tali));
        return pashminas;
    }

    private static List<Square> initDataSquare(Context ctx) {
        List<Square> squares = new ArrayList<>();
        squares.add(new Square("Bella Suare", "Bahan Katun",
                "Ukuran 115x115cm,Jahit tepi rapi neci,Lembut tidak mengkerut,Tegak didahi", R.drawable.square));
        squares.add(new Square("Segi Empat Cornskin", "Bahan Cornskin Premium ",
                "Ukuran 115x115cm,Bahan adem,Tegak didahi", R.drawable.cornskin));
        squares.add(new Square("Segi Empat Voal Motif", "Bahan Voal Premium",
                "Ukuran 110x110cm,Jahitan lasercut sangat rapi,Tegak didahi", R.drawable.voal));
        squares.add(new Square("Segi Empat Plisket", "Bahan Ceruty Babydoll Premium ",
                "Ukuran 115x115cm,sudah pasti ironless tidak perlu disetrika lagi saat dipakai, mudah bgt dibentuk", R.drawable.segi4_plisket));
        squares.add(new Square("Segi Empat Syar'i", "Bahan Wolfis",
                "Ukuran 130x130cm,nggak  nerawang, permukaan halus, mudah dibentuk", R.drawable.segi4_syari));
        return squares;
    }

    private static List<Bergo> initDataBergo(Context ctx) {
        List<Bergo> bergos = new ArrayList<>();
        bergos.add(new Bergo("Bergo Plisket Padi", "Bahan Ceruty",
                "Lebih adem,Menyerap Keringat,Ringan dipakai,Tali pisah", R.drawable.padi));
        bergos.add(new Bergo("Bergo Maryam", "Bahan Diamond Mouscrepe",
                "Kain jatuh,serat seperti jeruk halus,Lebih ringan,lentur dan mudah menyesuaikan bentuk wajah", R.drawable.maryam));
        bergos.add(new Bergo("Bergo Sport", "Bahan Jersey Higet",
                "Adem menyerap keringat,Pet anti tembem,cocok dipakai olahraga,Ukuran depan(ujung pet)45cm dan belakang 55cm", R.drawable.sport));
        bergos.add(new Bergo("Bergo Plisket Lidi", "Bahan Ceruty Babydoll Armany Original",
                "Bisa dipakai casual atau formal tetap nyaman/adem,Pet Antem bikin cantik dipakai,Jahitan  rapi", R.drawable.bergo_plisket));
        bergos.add(new Bergo("Bergo Rempel", "Bahan Diamond italiano",
                "Jahitan super rapi,tidak nerawang", R.drawable.bergo_rempel));
        return bergos;
    }

    private static void initAllHijabs(Context ctx) {
        hijabs.addAll(initDataPashmina(ctx));
        hijabs.addAll(initDataSquare(ctx));
        hijabs.addAll(initDataBergo(ctx));
    }

    public static List<Hijab> getAllHijab(Context ctx) {
        if (hijabs.size() == 0) {
            initAllHijabs(ctx);
        }
        return  hijabs;
    }

    public static List<Hijab> getHijabsByTipe(Context ctx, String jenis) {
        List<Hijab> hijabsByType = new ArrayList<>();
        if (hijabs.size() == 0) {
            initAllHijabs(ctx);
        }
        for (Hijab h : hijabs) {
            if (h.getJenis().equals(jenis)) {
                hijabsByType.add(h);
            }
        }
        return hijabsByType;
    }

}