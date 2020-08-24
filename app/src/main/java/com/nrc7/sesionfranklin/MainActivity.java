package com.nrc7.sesionfranklin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Voy a abrir el fragmento
                // = new DetailsFrament("usuario");
                // DetailsFragment.newInstance("franklin","cliente vip");

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, DetailsFragment.newInstance("",""), "detailsFragment")
                        .commit();
            }
        });
    }
}