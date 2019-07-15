package com.elisacapololo.andelachallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callFirst(View view) {
        Intent callA = new Intent(MainActivity.this, About.class);
        startActivity(callA);
    }

    public void callSecond(View view) {
        Intent callB = new Intent(MainActivity.this, Profile.class);
        startActivity(callB);
    }
}
