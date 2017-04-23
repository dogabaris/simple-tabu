package com.kivancyilmaz.tabu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_oyna = (Button) findViewById(R.id.btn_oyna);

        btn_oyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oyun = new Intent(MainActivity.this, TabuActivity.class);
                startActivity(oyun);
                finish();
            }
        });
    }



}
