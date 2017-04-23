package com.kivancyilmaz.tabu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by shadyfade on 21.04.2017.
 */
public class ResultActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String dogru = intent.getStringExtra("dogru");
        String yanlis = intent.getStringExtra("yanlis");
        String pas = intent.getStringExtra("pas");

        TextView tv_dogru = (TextView) findViewById(R.id.tv_dogru);
        TextView tv_yanlis = (TextView) findViewById(R.id.tv_yanlis);
        TextView tv_pas = (TextView) findViewById(R.id.tv_pas);
        Button  btn_kapat = (Button) findViewById(R.id.btn_kapat);

        tv_dogru.setText(dogru + " doğru");
        tv_yanlis.setText(yanlis + " yanlış");
        tv_pas.setText(pas + " pas");

        btn_kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oyun = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(oyun);
                finish();
            }
        });

    }
}
