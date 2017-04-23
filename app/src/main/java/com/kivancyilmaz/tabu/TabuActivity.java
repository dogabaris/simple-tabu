package com.kivancyilmaz.tabu;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by shadyfade on 21.04.2017.
 */
public class TabuActivity extends AppCompatActivity {

    static final String[] kelimeListe = {
            "TAVLA ZAR MARS KAPI OYUN"
            ,"GOOGLE ARAMA İNTERNET SİTE BİLGİSAYAR"
            ,"PARA KAĞIT DOLAR ALMAK KAZANMAK"
            ,"KALEM KURŞUN TÜKENMEZ DOLMA KAĞIT"
            ,"MÜCEVHER KADIN TAKI KOLYE ALTIN"
            ,"TAKVİM YIL AY HAFTA GÜN"
            ,"OJE TIRNAK MANİKÜR PEDİKÜR ASETON"
            ,"KAFATASI FOSİL BEYİN SAÇ KEMİK"
            ,"REÇETE DOKTOR İLAÇ İMZA ECZANE"
            ,"AKREP BURÇ SAAT YELKOVAN İBRE"
            ,"OFİS FAKS FOTOKOPİ TELEFON ÇALIŞMAK"
            ,"BİLGİSAYAR KLAVYE FARE EKRAN EXCEL"
            ,"BALIK ROKA HELVA TAVA OLTA"
            ,"AŞÇI MUTFAK ÖNLÜK MESLEK YEMEK"
            ,"SİFON TUVALET KOKU KLOZET İHTİYAÇ"
            ,"KUMBARA PARA YATIRIM BİRİKTİRMEK BANKA"
            ,"KREM VÜCUT EL SIVI KOZMETİK"
            ,"GEMİ DENİZ YOLCU KAPTAN FİLİKA"
            ,"SİNEMA MISIR BAHŞİŞ FİLM KARANLIK"
            ,"ANAHTAR KİLİT ÇİLİNGİR KAPI KASA"
            ,"SAAT KOL DUVAR 24 ZAMAN"
            ,"KARYOLA YATAK AHŞAP RANZA YASTIK"
            ,"SÜRAHİ SU BARDAK DÖKMEK MUTFAK"
            ,"DOLAP RAF KAPI ASKI TABAK"
            ,"FİNCAN ÇAY KAHVE KULP İÇMEK"
            ,"ÖKÜZ BOYNUZ TREN İNEK ET"
            ,"KİMYON KEKİK NANE BAHARAT KÖFTE"
            ,"ESKİMO KUTUP BUZUL KAR İGLO"
            ,"HAMAM SAUNA MASAJ TELLAK KESE"
            ,"FELEK KAHPE ŞANS HAYAT GECE"
            ,"KÜNEFE PEYNİR KAYMAK KADAYIF TATLI"
            ,"CÜPPE AVUKAT KIYAFET TÖREN MEZUNİYET"
            ,"REKTÖR ÜNİVERSİTE DEKAN KAMPÜS PROFESÖR"
            ,"RANZA YATAK ASKERİYE MOBİLYA TAHTA"
            ,"UD FASIL SAZ GİTAR MÜZİK"
            ,"MODEM İNTERNET ADSL WİRELESS BİLGİSAYAR"
            ,"VAZO ÇİÇEK SU HEDİYE BUKET"
            ,"KLOZET TUVALET ALAFRANGA SİFON KAPAK"
            ,"GEBE HAMİLE BEBEK DOĞURMAK EBE"
            ,"KALEMLİK KALEM OKUL ÖĞRENCİ YAZI"
            ,"ÖRGÜ KAZAK ATKI ŞİŞ YÜN"
            ,"MAKAS KAĞIT KESMEK KUMAK TERZİ"
            ,"FATURA FİŞ FİRMA KDV EMEKLİ"
            ,"ARI BAL KOVAN AYI MAYA"
            ,"HAKİM AVUKAT MAHKEME SUÇLU OLAY"
            ,"TİYATRO OYUNCU SAHNE PERDE YÖNETMEN"
            ,"DENİZ SU YAZ TATİL MAYO"
            ,"ZARF MEKTUP FATURA POSTAHANE POSTACI"
            ,"CESET ÖLÜ CİNAYET KATİL OTOPSİ"
            ,"KATALOG RESİM AJANS MANKEN ÜRÜN"
            ,"TOKA KAFA SAÇ KUAFÖR BİJUTERİ"
            ,"SANDAL SEFA DENİZ KÜREK BALIKÇI"
            ,"YUMURTA KAHVALTI TAVUK CİVCİV KULUÇKA"
            ,"KLAVYE MOUSE BİLGİSAYAR TUŞ KABLO"
            ,"SAÇ KUAFÖR FÖN KESTİRMEK BOYATMAK"
            ,"ETEK KUMAŞ DİKİŞ TERZİ İSKOÇ"
            ,"AJANDA TAKVİM EŞANTİYON TARİH REHBER"
            ,"SİGARA TÜTÜN ÇEKMEK ÇAKMAK PAKET"
            ,"TAVŞAN HAVUÇ DİŞLEK ÇİZGİ FİLM"
            ,"PALET DENİZ AYAK BALIK DALGIÇ"
            ,"TEHLİKE UYARI İKAZ ALARM YASAK"
            ,"PANTOLON AYAK JEANS KUMAŞ FERMUAR"
            ,"HİPODROM AT YARIŞ KOŞU JOKEY"
            ,"SONBAHAR MEVSİM YAPRAK AYLAR BAHAR"
    };

    TextView tv_timer,tv_kelime,tv_yasakli1,tv_yasakli2,tv_yasakli3,tv_yasakli4;
    int dogru=0,yanlis=0,pas=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabu);

        tv_kelime = (TextView) findViewById(R.id.tv_kelime);
        tv_yasakli1 = (TextView) findViewById(R.id.tv_yasakli1);
        tv_yasakli2 = (TextView) findViewById(R.id.tv_yasakli2);
        tv_yasakli3 = (TextView) findViewById(R.id.tv_yasakli3);
        tv_yasakli4 = (TextView) findViewById(R.id.tv_yasakli4);
        tv_timer = (TextView) findViewById(R.id.tv_timer);
        Button btn_exit = (Button) findViewById(R.id.btn_kapat);
        Button btn_tabu = (Button) findViewById(R.id.btn_tabu);
        Button btn_pas = (Button) findViewById(R.id.btn_pas);
        Button btn_dogru = (Button) findViewById(R.id.btn_dogru);
        Button  btn_kapat = (Button) findViewById(R.id.btn_kapat);

        yeniKelime();

        btn_dogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yeniKelime();
                dogru++;
            }
        });

        btn_pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yeniKelime();
                pas++;
            }
        });

        btn_tabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yeniKelime();
                yanlis++;
            }
        });

        final CountDownTimer timer;

        timer = new CountDownTimer(60000, 1000) { //60 saniye her 1 snde bir azalt

            public void onTick(long millisUntilFinished) {
                tv_timer.setText("" + (millisUntilFinished/1000));
            }
            public void onFinish() {
                Intent i=new Intent(TabuActivity.this , ResultActivity.class);
                i.putExtra("dogru", Integer.toString(dogru));
                i.putExtra("yanlis", Integer.toString(yanlis));
                i.putExtra("pas", Integer.toString(pas));
                startActivity(i);
                finish();
            }
        }.start();

        btn_kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.cancel();
                Intent oyun = new Intent(TabuActivity.this, MainActivity.class);
                startActivity(oyun);
                finish();
            }
        });
    }

    private void yeniKelime(){
        Random r = new Random();
        int rndm = r.nextInt(64);

        String split[]= kelimeListe[rndm].split("\\s+");

        String anahtar= split[0];//Anahtar Kelime
        //String yasakli= split[1] + " " + split[2] + " " + split[3] + " " + split[4];

        tv_kelime.setText(anahtar);
        tv_yasakli1.setText(split[1]);
        tv_yasakli2.setText(split[2]);
        tv_yasakli3.setText(split[3]);
        tv_yasakli4.setText(split[4]);
    }
}
